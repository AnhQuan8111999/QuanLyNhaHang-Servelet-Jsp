package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dao.MonAnDao;
import dao.MonAnDaoImpl;
import model.MonAn;

class MonAnTest {
	MonAnDao monAnDao=new MonAnDaoImpl();
	@Test
	void testFindByIdWithNullModel() {
		int id=0;
		MonAn monAn=monAnDao.findById(id);
		assertFalse(monAn.toString().isEmpty());
	}
	
	@Test
	void testFindByIdWithEmptyModel() {
		MonAn monAn=new MonAn();
		int id=monAn.getId();
		MonAn monAns=monAnDao.findById(id);
		assertFalse(monAns.toString().isEmpty());
	}
	@Test
	void testFindByIdWithValidModel() {
		MonAn monAn=new MonAn(11,"ca kho",4,10000f,"mon chinh",1);
		int id =11;
		MonAn monAns=monAnDao.findById(id);		
	}

	@Test
	void testGetAllWithNullModel() {
		String tenString="";
		List<MonAn> monAns=monAnDao.getAll(tenString);
		assertFalse(monAns.toString().isEmpty());
	}
	@Test
	void testGetAllWithEmptyModel() {
		MonAn monAn=new MonAn();
		String tenString=monAn.getTen();
		List<MonAn> monAns=monAnDao.getAll(tenString);
		assertFalse(monAns.toString().isEmpty());
	}
	@Test
	void testGetAllWithValidModel() {
		MonAn monAn=new MonAn(11,"ca kho",4,10000f,"mon chinh",1);
		String tenString=monAn.getTen();
		List<MonAn> monAns=monAnDao.getAll(tenString);
	}
	

}

