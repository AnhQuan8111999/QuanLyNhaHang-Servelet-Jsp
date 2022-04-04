package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.crypto.provider.RSACipher;

import dao.ComboDao;
import dao.ComboDaoImpl;
import model.Combo;

@WebServlet(urlPatterns = "/admin/add-combo")
public class AdminAddCombo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("error") != null) {
			req.setAttribute("err", "Tên combo đã bị trùng.Mời nhập lại");
		}
		req.getRequestDispatcher("/view/quanlycombo/addcombo.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		try {
			ComboDao comboDao = new ComboDaoImpl();
			String ten = req.getParameter("ten");
			Combo combo1 = comboDao.search(ten);			
			if (combo1 != null) {
				resp.sendRedirect("/QLNhaHang/admin/add-combo?error");
			} else {
				Combo combo = new Combo();
				combo.setIdnhaHang(Integer.parseInt(req.getParameter("idNhaHang")));
				combo.setIdnguoiDung(Integer.parseInt(req.getParameter("idNguoiDung")));
				combo.setTen(req.getParameter("ten"));
				combo.setLoai(Integer.parseInt(req.getParameter("loai")));
				combo.setGia(Float.parseFloat(req.getParameter("gia")));
				try {
					combo.setMoTa(req.getParameter("moTa"));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				comboDao.add(combo);

				resp.sendRedirect("/QLNhaHang/admin/danhsachmonan?id=" + combo.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("err1", "Tất cả các ô không được để trống ");
			doGet(req, resp);
		}
	}

}
