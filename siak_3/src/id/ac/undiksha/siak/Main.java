package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Dosen;
import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Manusia;
import id.ac.undiksha.siak.organisasi.Jurusan;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lecturer Object
		Manusia dsn1 = new Dosen("Galang Januarta S.Pd, M.T", "31 Oktober 1994", "Penarukan", false, "190023419", "081235234111");
		Manusia dsn2 = new Dosen("Tamayasa Korneki S.Kom, M.Kom", "31 Januari 1994", "Abian Semal", false, "190023419", "082235234111");

		// Student Object
        Mahasiswa mhs3 = new Mahasiswa( "Ardy Wirakusuma", "3 Maret 2004", "Banyuning", false, "22151010");
        Mahasiswa mhs4 = new Mahasiswa( "Eka Kurniawan", "3 Maret 2004", "Banyuning", false, "22151010");

        // Print Area
        System.out.println("======= Data Mahasiswa =======\n");
                
        mhs3.getProdi().setKodeProdi("10");
        mhs3.getProdi().setNamaProdi("Ilmu Komputer");
        
        
        mhs4.getProdi().setKodeProdi("11");
        mhs4.getProdi().setNamaProdi("Ilmu Komputer");
        
        mhs3.getProdi().getKorprodi().setNpwp("121");
        mhs3.getProdi().setKodeJurusan("1001");
        mhs3.getProdi().setKodeFakultas("100001");
        mhs4.printAll();
        mhs3.printAll();
	}
}
