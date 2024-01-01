package id.ac.undiksha.siak.people;

public abstract class Manusia {
	private String nama;
	private String tglLahir;
	private String alamat;
	private boolean Jk;
	
	public Manusia() {
		this.nama = "<Masukan nama>";
		this.tglLahir = "<Masukan tglLahir>";
		this.alamat = "<Masukan alamat>";
	}
	
	public Manusia(String nama, String tglLahir, String alamat, boolean jk) {
		super();
		this.nama = nama;
		this.tglLahir = tglLahir;
		this.alamat = alamat;
		Jk = jk;
	}

	public String getJk() {
		if (this.Jk) {
			return "Perempuan";
		}
		else {
			return "Laki - Laki";
		}
	}

	public void setJk(boolean jk) {
		Jk = jk;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(String tglLahir) {
		this.tglLahir = tglLahir;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	protected void printAll() {
		System.out.println("Nama            : " + this.getNama());
		System.out.println("Tanggal Lahir   : " + this.getTglLahir());
		System.out.println("Alamat          : " + this.getAlamat());
		System.out.println("Jenis Kelamin   : " + this.getJk());
	}
}
