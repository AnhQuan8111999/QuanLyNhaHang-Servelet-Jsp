package model;

public class ComBoMonAn {
	private int id;
	private MonAn monAn;
	private Combo combo;
	private int kieuPhucVu;
	private int trangThai;
	public ComBoMonAn() {
		// TODO Auto-generated constructor stub
	}
	public ComBoMonAn(int id, MonAn monAn,Combo combo,int kieuphucvu,int trangthai) {
		this.id=id;
		this.monAn=monAn;
		this.kieuPhucVu=kieuphucvu;
		this.trangThai=trangthai;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public MonAn getMonAn() {
		return monAn;
	}
	public void setMonAn(MonAn monAn) {
		this.monAn = monAn;
	}
	public Combo getCombo() {
		return combo;
	}
	public void setCombo(Combo combo) {
		this.combo = combo;
	}
	public int getKieuPhucVu() {
		return kieuPhucVu;
	}
	public void setKieuPhucVu(int kieuPhucVu) {
		this.kieuPhucVu = kieuPhucVu;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	
	
}
