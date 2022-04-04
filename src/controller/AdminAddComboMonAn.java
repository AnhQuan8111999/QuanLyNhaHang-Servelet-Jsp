package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ComBoMonAnDao;
import dao.ComBoMonAnDaoImpl;
import dao.ComboDao;
import dao.ComboDaoImpl;
import dao.MonAnDao;
import dao.MonAnDaoImpl;
import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;
import model.ComBoMonAn;
import model.Combo;
import model.MonAn;

@WebServlet(urlPatterns = "/admin/add-combomonan")
public class AdminAddComboMonAn extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int idmonan = Integer.parseInt(req.getParameter("idmonan"));
		int idcombo = Integer.parseInt(req.getParameter("idcombo"));

		ComBoMonAnDao comBoMonAnDao = new ComBoMonAnDaoImpl();
		ComBoMonAn comBoMonAn1 = comBoMonAnDao.get(idcombo, idmonan);

		MonAn monAn = new MonAn();
		monAn.setId(Integer.parseInt(req.getParameter("idmonan")));

		Combo combo = new Combo();
		combo.setId(Integer.parseInt(req.getParameter("idcombo")));

		ComBoMonAn comBoMonAn = new ComBoMonAn();
		comBoMonAn.setMonAn(monAn);
		comBoMonAn.setCombo(combo);
		
		long check = comBoMonAnDao.add(comBoMonAn);		
		if(check == 1) {
			resp.sendRedirect("/QLNhaHang/admin/danhsachmonan?id=" + combo.getId() + "&ok=1");
		}
		else {
			resp.sendRedirect("/QLNhaHang/admin/danhsachmonan?id=" + combo.getId() + "&ok=0");
		}		
	}

}
