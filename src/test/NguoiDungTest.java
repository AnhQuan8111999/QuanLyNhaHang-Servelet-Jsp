/*package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.NguoiDungDao;
import dao.NguoiDungDaoImpl;
import model.NguoiDung;

public class NguoiDungTest {
	NguoiDungDao NguoiDungDao = new NguoiDungDaoImpl();

	@Test
	public void testGetTenNguoiDungWithNullModel() {
		String username="";
		NguoiDung nguoiDung =NguoiDungDao.getTenNguoiDung(username);
		assertFalse(nguoiDung.toString().isEmpty());
	}
	@Test
	public void testGetTenNguoiDungWithEmptyModel() {
		NguoiDung nguoiDung = new NguoiDung();
		String username= nguoiDung.getUsername();
		NguoiDung nguoiDungs =NguoiDungDao.getTenNguoiDung(username);
		assertFalse(nguoiDungs.toString().isEmpty());
	}
	
	@Test
	public void testGetTenNguoiDungWithValidModel() {
		NguoiDung nguoiDung = new NguoiDung("son","123");
		String username= "son" ;
		NguoiDung nguoiDungs =NguoiDungDao.getTenNguoiDung(username);
	}
}
*/