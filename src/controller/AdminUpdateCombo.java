package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ComboDao;
import dao.ComboDaoImpl;
import model.Combo;

@WebServlet(urlPatterns = "/admin/updatecombo")
public class AdminUpdateCombo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("error") != null) {
			req.setAttribute("err", "Tên combo đã bị trùng.Mời nhập lại");
		}
		String check= req.getParameter("check");
		req.setAttribute("check", check);
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		ComboDao comboDao=new ComboDaoImpl();
		Combo combo=comboDao.get(id);
		req.setAttribute("combo", combo);
		req.getRequestDispatcher("/view/quanlycombo/updatecombo.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Combo combo=new Combo();
		combo.setId(Integer.parseInt(req.getParameter("id")));
		
		ComboDao comboDao = new ComboDaoImpl();
		String ten = req.getParameter("ten");
		Combo combo1 = comboDao.search(ten);
		
		if (combo1 != null) {
			resp.sendRedirect("/QLNhaHang/admin/update-combo?id="+ combo.getId()+"&error");
		} 
		else {		
		
		combo.setIdnguoiDung(Integer.parseInt(req.getParameter("idNguoiDung")));
		combo.setIdnhaHang(Integer.parseInt(req.getParameter("idNhaHang")));
		combo.setTen(req.getParameter("ten"));
		combo.setGia(Float.parseFloat(req.getParameter("gia")));
		combo.setLoai(Integer.parseInt(req.getParameter("loai")));
		combo.setMoTa(req.getParameter("moTa"));		
		long check=comboDao.update(combo);
		
		if(check==1) {
			resp.sendRedirect("/QLNhaHang/admin/danhsachcombo?check=1");
		}else {
			resp.sendRedirect("/QLNhaHang/admin/update-combo?id="+ combo.getId()+"&check=0");
		}
		}
	}
}
