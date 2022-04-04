package AdminController;

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

@WebServlet(urlPatterns = "/admin/update-combo")
public class AdminUpdateComboController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String check= req.getParameter("check");
		req.setAttribute("check", check);
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		ComboDao comboDao=new ComboDaoImpl();
		Combo combo=comboDao.get(id);
		req.setAttribute("combo", combo);
		
		ComBoMonAnDao comBoMonAnDao=new ComBoMonAnDaoImpl();
		List<ComBoMonAn> comBoMonAns=comBoMonAnDao.search(id);
		req.setAttribute("comBoMonAns", comBoMonAns);
		
		req.getRequestDispatcher("/view/qlcombo/gdEditcombo.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Combo combo=new Combo();
		combo.setId(Integer.parseInt(req.getParameter("id")));		
		ComboDao comboDao = new ComboDaoImpl();
							
		combo.setTen(req.getParameter("ten"));
		combo.setGia(Float.parseFloat(req.getParameter("gia")));
		combo.setMoTa(req.getParameter("moTa"));		
		long check=comboDao.update(combo);
		
		if(check==1) {
			resp.sendRedirect("/QLNhaHang/admin/danhsachmonan?id=" + combo.getId());
		}else {
			resp.sendRedirect("/QLNhaHang/admin/update-combo?id="+ combo.getId()+"&check=0");
		}
	}
}
