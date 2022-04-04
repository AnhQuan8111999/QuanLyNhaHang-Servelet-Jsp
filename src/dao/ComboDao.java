package dao;

import java.sql.SQLException;
import java.util.List;

import model.Combo;

public interface ComboDao {
	
	void add(Combo combo) throws SQLException;
	
	long update(Combo combo) ;
	
	void delete(int idcombo);
	
	Combo get(int id);
	
	Combo search(String ten);
	
	List<Combo> searchAll(String tenCombo);
}
