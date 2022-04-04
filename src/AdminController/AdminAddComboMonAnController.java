package AdminController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ComBoMonAnDao;
import dao.ComBoMonAnDaoImpl;
import model.ComBoMonAn;
import model.Combo;
import model.MonAn;

@WebServlet(urlPatterns = "/admin/addcombomonan")
public class AdminAddComboMonAnController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		MonAn monAn = new MonAn();
		monAn.setId(Integer.parseInt(req.getParameter("idmonan")));

		Combo combo = new Combo();
		combo.setId(Integer.parseInt(req.getParameter("idcombo")));

		ComBoMonAn comBoMonAn = new ComBoMonAn();
		comBoMonAn.setMonAn(monAn);
		comBoMonAn.setCombo(combo);
		
		ComBoMonAnDao comBoMonAnDao=new ComBoMonAnDaoImpl();
		long check = comBoMonAnDao.add(comBoMonAn);		
		if(check == 1) {
			resp.sendRedirect("/QLNhaHang/admin/danhsachmonan?id=" + combo.getId() + "&ok=1");
		}
		else {
			resp.sendRedirect("/QLNhaHang/admin/danhsachmonan?id=" + combo.getId() + "&ok=0");
		}		
	}
}
