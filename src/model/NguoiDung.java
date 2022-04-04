package model;

import java.sql.Date;

public class NguoiDung {
	 private int id;
	 private String username;
	 private String password;
	 private String sex;
	 private Date dateOfBirth;
	 private String ghiChu;
	 private int vaitro;
	 private int loaiQuanLy;
	 
	 private HoVaTen hoVaTen;
	 private LienHe lienHe;
	 public NguoiDung() {
		// TODO Auto-generated constructor stub
	}
	 
	 public NguoiDung( String username, String password) {
		 this.username=username;
		 this.password=password;
	 }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public int getVaitro() {
		return vaitro;
	}
	public void setVaitro(int vaitro) {
		this.vaitro = vaitro;
	}
	public int getLoaiQuanLy() {
		return loaiQuanLy;
	}
	public void setLoaiQuanLy(int loaiQuanLy) {
		this.loaiQuanLy = loaiQuanLy;
	}
	public HoVaTen getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(HoVaTen hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public LienHe getLienHe() {
		return lienHe;
	}
	public void setLienHe(LienHe lienHe) {
		this.lienHe = lienHe;
	}
	 
	
	 
}
