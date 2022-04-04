package AdminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ComboDao;
import dao.ComboDaoImpl;
import model.Combo;

@WebServlet(urlPatterns = "/admin/danhsach-combo")
public class AdminDanhSachComboController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ComboDao comboDao=new ComboDaoImpl();
		List<Combo> combos=comboDao.searchAll("");
		
		String check= req.getParameter("check");
		req.setAttribute("check", check);
		
		req.setAttribute("combos", combos);
		req.getRequestDispatcher("/view/qlcombo/gdxemdscombo.jsp").forward(req, resp);
	}
}
