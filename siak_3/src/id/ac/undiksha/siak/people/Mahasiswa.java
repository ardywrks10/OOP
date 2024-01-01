package id.ac.undiksha.siak.people;
import id.ac.undiksha.siak.organisasi.Prodi;

public class Mahasiswa extends Manusia{
	
	private String nim;
//	private String prodi; //0 = laki laki, 1 = perempuan
	
	public Mahasiswa () {
		this.nim   = "<Masukan NIM>";
//		this.prodi = "<Masukan prodi>";
//		super.setNama("<Masukan nama dari mahasiswa : >");
	}
	
	public Prodi prodi = new Prodi();
	public Prodi getProdi() {
		return prodi;
	}

	public Mahasiswa(String nama, String tglLahir, String alamat, boolean jk) {
		super(nama, tglLahir, alamat, jk);
		// TODO Auto-generated constructor stub
	}
	
	public Mahasiswa(String nama, String tglLahir, String alamat, boolean jk, String nim) {
		super(nama, tglLahir, alamat, jk);
		this.nim = nim;
//		this.prodi = prodi;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public String getNim() {
		return this.nim;
	}
	
//	public String getProdi() {
//		return prodi;
//	}

//	public void setProdi(String prodi) {
//		this.prodi = prodi;
//	}
	
	public void printAll() {
		super.printAll();
		System.out.println("Nim             : " + this.getNim());
//		System.out.println("Prodi           : " + this.getProdi());
		System.out.println();
	}
}
