package AdminController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ComboDao;
import dao.ComboDaoImpl;
import model.Combo;

@WebServlet(urlPatterns = "/admin/addcombo")
public class AdminAddComboController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("error") != null) {
			req.setAttribute("err", "Tên combo đã bị trùng.Mời nhập lại");
		}
		req.getRequestDispatcher("/view/qlcombo/gdthemcombo.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String tenCombo = req.getParameter("ten");
			ComboDao comboDao = new ComboDaoImpl();
			Combo combo1 = comboDao.search(tenCombo);
			if (combo1 != null) {
				resp.sendRedirect("/QLNhaHang/admin/addcombo?error");
			} 
			else {
				Combo combo = new Combo();
				combo.setTen(tenCombo);
				combo.setGia(Float.parseFloat(req.getParameter("gia")));
				combo.setMoTa(req.getParameter("moTa"));
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
