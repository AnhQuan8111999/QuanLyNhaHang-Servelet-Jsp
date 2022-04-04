package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MonAnDao;
import dao.MonAnDaoImpl;
import model.MonAn;

@WebServlet(urlPatterns = "/admin/index")
public class AdminIndex extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MonAnDao monAnDao = new MonAnDaoImpl();
		List<MonAn> monAns = monAnDao.getAll("");
		req.setAttribute("monAns", monAns);
		req.getRequestDispatcher("/view/quanlycombo/gdChinhqlCombo.jsp").forward(req, resp);
	}
}
