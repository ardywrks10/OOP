package id.ac.undiksha.siak.organisasi;
import id.ac.undiksha.siak.people.Dosen;

public class Prodi implements Jurusan {
	
	String kodeFakultas;
	String namaFakultas;

	@Override
	public void setKodeFakultas(String kodeFakultas) {
		// TODO Auto-generated method stub
		this.kodeFakultas = kodeFakultas;
	}
	@Override
	public String getKodeFakultas() {
		// TODO Auto-generated method stub
		return this.kodeFakultas;
	}
	@Override
	public void setNamaFakultas(String namaFakultas) {
		// TODO Auto-generated method stub
		this.namaFakultas = namaFakultas;
	}
	@Override
	public String setNamaFakultas() {
		// TODO Auto-generated method stub
		return this.namaFakultas;
	}
	String kodeJurusan;
	@Override
	public void setKodeJurusan(String kodeJurusan) {
		// TODO Auto-generated method stub
		this.kodeJurusan = kodeJurusan;
	}
	@Override
	public String getKodeJurusan() {
		// TODO Auto-generated method stub
		return this.kodeJurusan;
	}
	String namaJurusan;
	@Override
	public void setNamaJurusan(String namaJurusan) {
		// TODO Auto-generated method stub
		this.namaJurusan = namaJurusan;
	}
	@Override
	public String getNamaJurusan() {
		// TODO Auto-generated method stub
		return this.namaJurusan;
	}

	private String KodeProdi;
	private String namaProdi;
	
	public String getKodeProdi() {
		return KodeProdi;
	}
	public void setKodeProdi(String kodeProdi) {
		KodeProdi = kodeProdi;
	}
	public String getNamaProdi() {
		return namaProdi;
	}
	public void setNamaProdi(String namaProdi) {
		this.namaProdi = namaProdi;
	}
	
	Dosen korprodi = new Dosen();

	public Dosen getKorprodi() {
		return korprodi;
	}
	
}
