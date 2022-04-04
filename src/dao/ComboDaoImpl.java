package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import model.Combo;
import model.NguoiDung;
import model.NhaHang;

public class ComboDaoImpl implements ComboDao {

	@Override
	public void add(Combo combo) throws SQLException {
		Connection connection = JDBCConnection.getJDBConnection();
		String sql = "insert into Combo(ten,gia,mota) value(?,?,?)";
		
		//String sql = "insert into Combo(idnhahang,idnguoidung,ten,loai,gia,mota) value(?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);						
			preparedStatement.setString(1, combo.getTen());			
			preparedStatement.setFloat(2, combo.getGia());
			preparedStatement.setString(3, combo.getMoTa());
						
			preparedStatement.executeUpdate();
			ResultSet rs = preparedStatement.getGeneratedKeys();
			if (rs.next()) {             // NEU CO tao moi va ID tu gen o sql
				combo.setId(rs.getInt(1));  // lay id cua combo
			}
	}

	@Override
	public long update(Combo combo)  {
		Connection connection = JDBCConnection.getJDBConnection();
		String sql = "Update Combo set ten=?,gia=?,mota=? where id=?";

		
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);		
				preparedStatement.setString(1, combo.getTen());		
				preparedStatement.setFloat(2, combo.getGia());
				preparedStatement.setString(3, combo.getMoTa());
				preparedStatement.setInt(4, combo.getId());

				preparedStatement.executeUpdate();
				
				return 1l;
			} catch (SQLException e) {
				return 0l;
			}
			
					
	}

	@Override
	public void delete(int idcombo) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sqlString = "delete from combo where id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
			preparedStatement.setInt(1, idcombo);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Combo get(int id) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sqlString = "select * from combo where id=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				return rowMap(rs);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Combo search(String ten) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sqlString = "select * from combo where ten=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
			preparedStatement.setString(1, ten);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				return rowMap(rs);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Combo> searchAll(String tenCombo) {
		List<Combo> combos = new ArrayList<Combo>();
		Connection connection = JDBCConnection.getJDBConnection();
		String sqlString = "select * from combo where ten like ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
			preparedStatement.setString(1, "%"+tenCombo+"%");

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Combo combo=rowMap(rs);
				combos.add(combo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return combos;
	}

	private Combo rowMap(ResultSet rs) throws SQLException {

		Combo combo = new Combo();
		combo.setId(rs.getInt("id"));
		combo.setTen(rs.getString("ten"));
		combo.setLoai(rs.getInt("loai"));
		combo.setGia(rs.getFloat("gia"));
		combo.setMoTa(rs.getString("mota"));
		combo.setIdnguoiDung(rs.getInt("idnguoidung"));
		combo.setIdnhaHang(rs.getInt("idnhahang"));
		return combo;
	}
}
