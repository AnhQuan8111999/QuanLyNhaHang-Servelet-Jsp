package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ComBoMonAn;
import model.Combo;
import model.MonAn;

public class ComBoMonAnDaoImpl implements ComBoMonAnDao {

	@Override
	public long add(ComBoMonAn comBoMonAn) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sql = "insert into combomonan(idcombo,idmonan) value(?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, comBoMonAn.getCombo().getId());
			preparedStatement.setInt(2, comBoMonAn.getMonAn().getId());

			preparedStatement.executeUpdate();
			
			return 1l;
		} catch (SQLException e) {
			return 0l;
			//e.printStackTrace();
		}
	}

	@Override
	public void delete1(int id) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sqlString = "delete from combomonan where id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete2(ComBoMonAn comBoMonAn) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sqlString = "delete from combomonan where idcombo=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
			preparedStatement.setInt(1, comBoMonAn.getCombo().getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<ComBoMonAn> search(int idCombo) {
		List<ComBoMonAn> comBoMonAns = new ArrayList<ComBoMonAn>();
		Connection connection = JDBCConnection.getJDBConnection();
		String sql = "select tb.*, monan.ten, monan.gia, monan.mota  from combomonan tb inner join monan on tb.idmonan=monan.id  where tb.idcombo = ?";
		
		
		// SELECT bp.*, product.name, product.image, product.id as 'p_id' from
		// bill_product bp inner join product on bp.product_id = product.id WHERE
		// bp.bill_id = ?

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idCombo);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				ComBoMonAn comBoMonAn = new ComBoMonAn();
				comBoMonAn.setId(rs.getInt("id"));
				comBoMonAn.setKieuPhucVu(rs.getInt("kieuphucvu"));
				comBoMonAn.setTrangThai(rs.getInt("trangthai"));

				MonAn monAn = new MonAn();
				monAn.setTen(rs.getString("ten"));		
				monAn.setGia(rs.getFloat("gia"));
				monAn.setMoTa(rs.getString("mota"));

				comBoMonAn.setMonAn(monAn);

				comBoMonAns.add(comBoMonAn);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comBoMonAns;
	}

	@Override
	public ComBoMonAn get(int idcombo, int idmonan) {
		Connection connection = JDBCConnection.getJDBConnection();
		String sql = "select * from combomonan where idcombo=? and idmonan=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idcombo);
			preparedStatement.setInt(2, idmonan);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {

				Combo combo = new Combo();
				combo.setId(rs.getInt("idcombo"));

				MonAn monAn = new MonAn();
				monAn.setId(rs.getInt("idmonan"));

				ComBoMonAn comBoMonAn = new ComBoMonAn();
				comBoMonAn.setCombo(combo);
				comBoMonAn.setMonAn(monAn);
				return comBoMonAn;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
