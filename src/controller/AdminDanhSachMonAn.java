package controller;

import java.io.IOException;
import java.util.ArrayList;
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

@WebServlet(urlPatterns = "/admin/danhsach-monan")
public class AdminDanhSachMonAn extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id= Integer.parseInt(req.getParameter("id"));
		String check= req.getParameter("ok");
		req.setAttribute("check", check);
		
		ComboDao comboDao = new ComboDaoImpl();
	    Combo combo = comboDao.get(id);
		req.setAttribute("combo", combo);

		MonAnDao monAnDao = new MonAnDaoImpl();
		List<MonAn> monAns = monAnDao.getAll("");
		req.setAttribute("monAns", monAns);

		//HttpSession session = req.getSession();
		//Combo combo = (Combo) session.getAttribute("combo");

		req.getRequestDispatcher("/view/quanlycombo/danhsachmonan.jsp").forward(req, resp);
	}
}
