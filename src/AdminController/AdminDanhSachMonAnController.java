package AdminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ComboDao;
import dao.ComboDaoImpl;
import dao.MonAnDao;
import dao.MonAnDaoImpl;
import model.Combo;
import model.MonAn;

@WebServlet(urlPatterns = "/admin/danhsachmonan")
public class AdminDanhSachMonAnController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String check= req.getParameter("ok");
		req.setAttribute("check", check);
		
		int idcombo=Integer.parseInt(req.getParameter("id"));
		ComboDao comboDao = new ComboDaoImpl();
	    Combo combo = comboDao.get(idcombo);
		req.setAttribute("combo", combo);
		
		HttpSession session = req.getSession();
		session.setAttribute("combo",combo );

		MonAnDao monAnDao = new MonAnDaoImpl();
		List<MonAn> monAns = monAnDao.getAll("");
		req.setAttribute("monAns", monAns);
		
		req.getRequestDispatcher("/view/qlcombo/gddanhsachmonan.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tenmonan=req.getParameter("ten");
		MonAnDao monAnDao = new MonAnDaoImpl();
		List<MonAn> monAns = monAnDao.getAll("");
		req.setAttribute("monAns", monAns);
		
		HttpSession session = req.getSession();
		Combo combo =(Combo) session.getAttribute("combo");
		
		resp.sendRedirect("/QLNhaHang/admin/danhsachmonan?id=" + combo.getId());
	}
}
