package AdminController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ComboDao;
import dao.ComboDaoImpl;
import dao.MonAnDao;
import dao.MonAnDaoImpl;
import model.Combo;
import model.MonAn;

@WebServlet(urlPatterns = "/admin/monan")
public class AdminMonAnController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idmonan=Integer.parseInt(req.getParameter("idmonan"));
		MonAnDao monAnDao=new MonAnDaoImpl();
		MonAn monAn=monAnDao.findById(idmonan);
		
		int idcombo=Integer.parseInt(req.getParameter("idcombo"));
		ComboDao comboDao=new ComboDaoImpl();
		Combo combo=comboDao.get(idcombo);
		
		req.setAttribute("monAn", monAn);
		req.setAttribute("combo", combo);
		
		req.getRequestDispatcher("/view/qlcombo/gdmonan.jsp").forward(req, resp);
	}
}
