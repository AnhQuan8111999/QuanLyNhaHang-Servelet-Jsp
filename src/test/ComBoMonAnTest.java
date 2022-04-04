package test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dao.ComBoMonAnDao;
import dao.ComBoMonAnDaoImpl;
import model.ComBoMonAn;
import model.Combo;
import model.MonAn;

class ComBoMonAnTest {
	ComBoMonAnDao comBoMonAnDao=new ComBoMonAnDaoImpl();
	@Test
	void testAddWithNullModel() {
		ComBoMonAn comBoMonAn=null;
		comBoMonAnDao.add(comBoMonAn);
		assertFalse(comBoMonAn.toString().isEmpty());
	}
	@Test
	void testAddWithEmptyModel() {
		ComBoMonAn comBoMonAn=new ComBoMonAn();
		comBoMonAnDao.add(comBoMonAn);
		assertFalse(comBoMonAn.toString().isEmpty());
	}
	@Test
	void testAddWithValidModel() {
		ComBoMonAn comBoMonAn=new ComBoMonAn();
		MonAn monAn=new MonAn();
		Combo combo=new Combo();
		comBoMonAn.setId(30);
		comBoMonAn.setMonAn(monAn);
		comBoMonAn.setCombo(combo);
		comBoMonAn.setKieuPhucVu(1);
		comBoMonAn.setTrangThai(1);
		comBoMonAnDao.add(comBoMonAn);
	}

	@Test
	void testDelete1WithNullModel() {
		ComBoMonAn comBoMonAn=null;
		comBoMonAnDao.delete1(comBoMonAn.getId());
		assertFalse(comBoMonAn.toString().isEmpty());
	}
	@Test
	void testDelete1WithEmptyModel() {
		ComBoMonAn comBoMonAn=new ComBoMonAn();
		comBoMonAnDao.delete1(comBoMonAn.getId());
		assertFalse(comBoMonAn.toString().isEmpty());
	}
	@Test
	void testDelete1WithValidModel() {
		
		MonAn monAn=new MonAn();
		Combo combo=new Combo();
		ComBoMonAn comBoMonAn=new ComBoMonAn(1,monAn,combo,1,1);
		
		comBoMonAnDao.delete1(comBoMonAn.getId());
	}

	@Test
	void testDelete2WithNullModel() {
		ComBoMonAn comBoMonAn=null;
		comBoMonAnDao.delete2(comBoMonAn);		
		assertFalse(comBoMonAn.toString().isEmpty());
	}
	@Test
	void testDelete2WithEmptyModel() {
		ComBoMonAn comBoMonAn=new ComBoMonAn();
		comBoMonAnDao.delete2(comBoMonAn);		
		assertFalse(comBoMonAn.toString().isEmpty());
	}
	@Test
	void testDelete2WithValidModel() {
		MonAn monAn=new MonAn();
		Combo combo=new Combo();
		ComBoMonAn comBoMonAn=new ComBoMonAn(1,monAn,combo,1,1);
		comBoMonAnDao.delete2(comBoMonAn);				
	}

	@Test
	void testSearchWithNullModel() {
		Combo combo= null;
		int id=combo.getId();
		List<ComBoMonAn> comBoMonAn2=comBoMonAnDao.search(id);
		assertFalse(comBoMonAn2.toString().isEmpty());
	}
	@Test
	void testSearchWithEmptyModel() {
		Combo combo= new Combo();
		int id=combo.getId();
		List<ComBoMonAn> comBoMonAn2=comBoMonAnDao.search(id);
		assertFalse(comBoMonAn2.toString().isEmpty());
	}
	@Test
	void testSearchWithValidModel() {
		Combo combo=new Combo(31,"Combo31",2,1000f,"Combo cho 4 nguoi",1,1);
		MonAn monAn=new MonAn(11,"ca kho",4,10000f,"mon chinh",1);
		ComBoMonAn comBoMonAn=new ComBoMonAn(12, monAn, combo, 1, 1);
		int id=combo.getId();
		List<ComBoMonAn> comBoMonAn2=comBoMonAnDao.search(id);
	}

	@Test
	void testGetWithNullModel() {
		Combo combo= null;
		int idcombo=combo.getId();
		MonAn monAn=null;
		int idmonan=monAn.getId();
		ComBoMonAn comBoMonAn=comBoMonAnDao.get(idcombo, idmonan);
		assertFalse(comBoMonAn.toString().isEmpty());
	}
	
	@Test
	void testGetWithEmptyModel() {
		Combo combo= new Combo();
		int idcombo=combo.getId();
		MonAn monAn=new MonAn();
		int idmonan=monAn.getId();
		ComBoMonAn comBoMonAn=comBoMonAnDao.get(idcombo, idmonan);
		assertFalse(comBoMonAn.toString().isEmpty());
	}
	
	@Test
	void testGetWithValidModel() {
		Combo combo=new Combo(31,"Combo31",2,1000f,"Combo cho 4 nguoi",1,1);
		MonAn monAn=new MonAn(11,"ca kho",4,10000f,"mon chinh",1);
		ComBoMonAn comBoMonAn=new ComBoMonAn(12, monAn, combo, 1, 1);
		ComBoMonAn comBoMonAn1=comBoMonAnDao.get(31, 11);
	}

}
