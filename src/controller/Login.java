package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NguoiDungDao;
import dao.NguoiDungDaoImpl;
import model.NguoiDung;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("error")!=null) {
			req.setAttribute("err", "Thông tin tài khoản,mật khẩu không chính xác");
		}
		req.getRequestDispatcher("/view/quanlycombo/gdLogin.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username= req.getParameter("username");
		String password=req.getParameter("password");
		
		
		NguoiDungDao nguoiDungDao=new NguoiDungDaoImpl();
		NguoiDung nguoiDung=nguoiDungDao.getTenNguoiDung(username);
		
		if(nguoiDung!=null && nguoiDung.getPassword().equals(password)) {
			if(nguoiDung.getVaitro()==2){
				resp.sendRedirect("/QLNhaHang/admin/index");
			}
		}else {
			resp.sendRedirect("/QLNhaHang/login?error");
		}
	}
}
