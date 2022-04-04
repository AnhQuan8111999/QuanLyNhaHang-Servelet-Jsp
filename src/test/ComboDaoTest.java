/*package test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.ComboDao;
import dao.ComboDaoImpl;
import model.Combo;

public class ComboDaoTest {
	ComboDao comboDao = new ComboDaoImpl();

	@Test()
	public void testAddWithNullModel() {
		Combo combo = null;
		try {
			comboDao.add(combo);
		} catch (SQLException e) {
			System.out.println("Loi :" + e);
		}
	}

	@Test()
	public void testAddWithEmptyModel() {
		Combo combo = new Combo();

		try {
			comboDao.add(combo);
		} catch (SQLException e) {
			System.out.println("Loi :" + e);
		}

	}

	@Test()
	public void testAddWithValidModel() {
		Combo combo = new Combo();
		combo.setTen("Combotest");
		combo.setGia(120000F);
		combo.setMoTa("Combo cho 2 nguoi");

		try {
			comboDao.add(combo);
		} catch (SQLException e) {
			System.out.println("Loi :" + e);
		}

	}

	@Test
	public void testUpdateWithNullModel() {
		Combo combo = null;		
		comboDao.update(combo);
		assertFalse(combo.toString().isEmpty());
	}
	@Test
	public void testUpdateWithEmptyModel() {
		Combo combo = new Combo();		
		comboDao.update(combo);
		assertFalse(combo.toString().isEmpty());
	}

	@Test
	public void testUpdateWithValidModel() {
		Combo combo = new Combo();	
		combo.setId(1);
		combo.setTen("Combo30");
		combo.setGia(10000f);
		combo.setMoTa("Combo cho 2 nguoi");
		comboDao.update(combo);
		
	}


	@Test
	public void testDeleteWithhNullModel() {
		Combo combo = null;	
		comboDao.delete(combo.getId());
		assertFalse(combo.toString().isEmpty());
	}
	
	@Test
	public void testDeleteWithhEmptyModel() {
		Combo combo = new Combo();	
		comboDao.delete(combo.getId());
		assertFalse(combo.toString().isEmpty());
	}
	@Test
	public void testDeleteWithValidModel() {
		Combo combo=new Combo(31,"Combo31",2,1000f,"Combo cho 4 nguoi",1,1);
		int id=31;
		comboDao.delete(id);
	}

	@Test
	public void testGetWithNullModel() {
		int id=0;
		Combo combo=comboDao.get(id);
		assertFalse(combo.toString().isEmpty());
	}
	@Test
	public void testGetWithEmptyModel() {
		Combo combo= new Combo();
		Combo comboa=comboDao.get(combo.getId());
		assertFalse(combo.toString().isEmpty());
	}
	@Test
	public void testGetWithValidModel() {
		Combo combo=new Combo(31,"Combo31",2,1000f,"Combo cho 4 nguoi",1,1);
		int id=combo.getId();
		Combo combos=comboDao.get(id);
	}

	@Test
	public void testSearchWithNullModel() {
		String tenString="";
		Combo combo=comboDao.search(tenString);
		assertFalse(combo.toString().isEmpty());
	}
	@Test
	public void testSearchWithEmptyModel() {
		Combo combo= new Combo();
		Combo combos=comboDao.search(combo.getTen());
		assertFalse(combo.toString().isEmpty());
	}
	@Test
	public void testSearchWithValidModel() {
		Combo combo=new Combo(31,"Combo31",2,1000f,"Combo cho 4 nguoi",1,1);
		String ten=combo.getTen();
		Combo combos=comboDao.search(ten);
		
	}

	@Test
	public void testSearchAllWithNullModel() {
		String ten="";
		List<Combo> combos=comboDao.searchAll(ten);
		assertFalse(combos.toString().isEmpty());
	}
	@Test
	public void testSearchAllWithEmptyModel() {
		Combo combo=new Combo();
		String ten=combo.getTen();
		List<Combo> combos=comboDao.searchAll(ten);
		assertFalse(combos.toString().isEmpty());
	}
	@Test
	public void testSearchAllWithValidModel() {
		Combo combo=new Combo(31,"Combo31",2,1000f,"Combo cho 4 nguoi",1,1);
		List<Combo> combos=new ArrayList<Combo>();
		combos.add(combo);
		String ten=combo.getTen();
		List<Combo> combos1=comboDao.searchAll(ten);
		
	}

}
*/
