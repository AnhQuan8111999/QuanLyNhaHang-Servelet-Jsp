package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ComBoMonAnDao;
import dao.ComBoMonAnDaoImpl;
import dao.ComboDao;
import dao.ComboDaoImpl;
import model.ComBoMonAn;
import model.Combo;

@WebServlet(urlPatterns = "/admin/danhsachmonancombo")
public class AdminDanhSachMonAnCombo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idCombo=Integer.parseInt(req.getParameter("id"));
		
		ComboDao comboDao = new ComboDaoImpl();
	    Combo combo = comboDao.get(idCombo);
		req.setAttribute("combo", combo);
		
		ComBoMonAnDao comBoMonAnDao=new ComBoMonAnDaoImpl();
		List<ComBoMonAn> comBoMonAns=comBoMonAnDao.search(idCombo);
		req.setAttribute("comBoMonAns", comBoMonAns);
		
		req.getRequestDispatcher("/view/quanlycombo/danhsachmonancombo.jsp").forward(req, resp);
	}
}
