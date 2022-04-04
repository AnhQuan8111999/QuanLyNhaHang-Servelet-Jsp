package dao;

import java.util.List;

import model.MonAn;

public interface MonAnDao {
	MonAn findById(int id);
	
	//MonAn findByName(String tenMonAn);
	
	List<MonAn> getAll(String tenMonAn);
}
