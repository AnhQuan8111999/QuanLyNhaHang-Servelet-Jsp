package model;

public class MonAn {
	private int id;
	private String ten;
	private int loai;
	private float gia;
	private String moTa;
	private int idNhaHang;
	
	public MonAn() {
		// TODO Auto-generated constructor stub
	}
	public MonAn(int id,String ten,int loai,float gia, String mota,int idnhahang) {
		this.id=id;
		this.ten=ten;
		this.loai=loai;
		this.gia=gia;
		this.moTa=mota;
		this.idNhaHang=idnhahang;
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
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getIdNhaHang() {
		return idNhaHang;
	}
	public void setIdNhaHang(int idNhaHang) {
		this.idNhaHang = idNhaHang;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	
	
	
}
