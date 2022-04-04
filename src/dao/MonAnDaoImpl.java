package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Combo;
import model.MonAn;

public class MonAnDaoImpl implements MonAnDao {

	@Override
	public MonAn findById(int id) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sqlString = "select * from monan where id=?";
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
	public List<MonAn> getAll(String tenMonAn) {
		List<MonAn> monAns=new ArrayList<MonAn>();
		Connection connection = JDBCConnection.getJDBConnection();
		String sqlString = "select * from monan where ten like ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
			preparedStatement.setString(1, "%"+tenMonAn+"%");

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				MonAn monAn=rowMap(rs);
				monAns.add(monAn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return monAns;
	}

	private MonAn rowMap(ResultSet rs) throws SQLException {
		MonAn monAn = new MonAn();
		monAn.setId(rs.getInt("id"));
		monAn.setIdNhaHang(rs.getInt("idnhahang"));
		monAn.setTen(rs.getString("ten"));
		monAn.setLoai(rs.getInt("loai"));
		monAn.setGia(rs.getFloat("gia"));
		monAn.setMoTa(rs.getString("mota"));
		return monAn;

	}

	/*@Override
	public MonAn findByName(String tenMonAn) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sqlString = "select * from monan where ten = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
			preparedStatement.setString(1, tenMonAn);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				return rowMap(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}*/
}
