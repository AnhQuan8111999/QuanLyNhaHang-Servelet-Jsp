package model;

public class Combo {
	private int id;
	private String ten;
	private int loai;
	private Float gia;
	private String moTa;
	private int idnguoiDung;
	private int idnhaHang;
	public Combo() {
		// TODO Auto-generated constructor stub
	}

	public Combo(int id, String ten, int loai, float gia, String mota, int idnhahang, int idkhachhang) {
		this.id=id;
		this.ten=ten;
		this.loai=loai;
		this.gia=gia;
		this.moTa=mota;
		this.idnhaHang=idnhahang;
		this.idnguoiDung=idnguoiDung;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getLoai() {
		return loai;
	}
	public void setLoai(int loai) {
		this.loai = loai;
	}
	public Float getGia() {
		return gia;
	}
	public void setGia(Float gia) {
		this.gia = gia;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getIdnguoiDung() {
		return idnguoiDung;
	}
	public void setIdnguoiDung(int idnguoiDung) {
		this.idnguoiDung = idnguoiDung;
	}
	public int getIdnhaHang() {
		return idnhaHang;
	}
	public void setIdnhaHang(int idnhaHang) {
		this.idnhaHang = idnhaHang;
	}
}
