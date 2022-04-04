package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.NguoiDung;
import sun.swing.StringUIClientPropertyKey;

public class NguoiDungDaoImpl implements NguoiDungDao {

	@Override
	public NguoiDung getTenNguoiDung(String username) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sql = "select *from nguoidung where username =?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				
				return rowMap(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private NguoiDung rowMap(ResultSet rs) throws SQLException {
		NguoiDung nguoiDung= new NguoiDung();
		nguoiDung.setUsername(rs.getString("username"));
		nguoiDung.setPassword(rs.getString("password"));
		nguoiDung.setVaitro(Integer.parseInt(rs.getString("vaitro")));
		return nguoiDung;
	}

}
