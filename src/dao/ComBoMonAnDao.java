package dao;

import java.util.List;

import model.ComBoMonAn;

public interface ComBoMonAnDao {
	long add(ComBoMonAn comBoMonAn);
	
	void delete1(int id);
	
	void delete2(ComBoMonAn comBoMonAn);
	
	ComBoMonAn get(int idcombo,int idmonan);
	
	List<ComBoMonAn> search(int idCombo);
}
