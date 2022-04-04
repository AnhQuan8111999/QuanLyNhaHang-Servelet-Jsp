package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ComBoMonAnDao;
import dao.ComBoMonAnDaoImpl;
import model.ComBoMonAn;

@WebServlet(urlPatterns = "/admin/xoamonancombo")
public class AdminDeleteMonAnCombo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idcombo=Integer.parseInt(req.getParameter("idcombo"));
		
		int id=Integer.parseInt(req.getParameter("id"));		
		ComBoMonAnDao comBoMonAnDao=new ComBoMonAnDaoImpl();
		comBoMonAnDao.delete1(id);
		
		resp.sendRedirect("/QLNhaHang/admin/danhsachmonancombo?id="+idcombo);
	}
}
