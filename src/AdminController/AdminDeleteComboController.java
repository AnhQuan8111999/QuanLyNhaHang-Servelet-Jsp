package AdminController;

import java.io.IOException;

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
import model.MonAn;

@WebServlet(urlPatterns = "/admin/delete-combo")
public class AdminDeleteComboController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idcombo=Integer.parseInt(req.getParameter("id"));
		
		ComboDao comboDao=new ComboDaoImpl();
		Combo combo=comboDao.get(idcombo);
		comboDao.delete(idcombo);
		
		ComBoMonAn comBoMonAn=new ComBoMonAn();
		comBoMonAn.setCombo(combo);
		ComBoMonAnDao comBoMonAnDao=new ComBoMonAnDaoImpl();
		comBoMonAnDao.delete2(comBoMonAn);
		
		resp.sendRedirect("/QLNhaHang/admin/danhsach-combo");
		
		
	}
}
