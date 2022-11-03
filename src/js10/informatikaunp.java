
package js10;

/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class informatikaunp {
    public static void main(String args[]){
        mahasiswa informatika = new mahasiswa();
        mahasiswa elektronika = new mahasiswa();
        
        informatika.nama = "Happy Alicia";
        informatika.nim = 1;
        informatika.jur = "S1 informatika";
        informatika.univ = "Universitas Negeri Padang";
        
        elektronika.nama = "Wilson";
        elektronika.nim = 2;
        elektronika.jur = "S1 Elektronika";
        elektronika.univ = "Universitas Negeri Padang";
        
        System.out.println("Data Mahasiswa Informatika");
        System.out.println("Nama : " +informatika.nama);
        System.out.println("NIM : " +informatika.nim);
        System.out.println("Jurusan : " +informatika.jur);
        System.out.println("Status : " +informatika.univ);
        
        System.out.println("-----------------------------------------");
        
        System.out.println("Data Mahasiswa Elektronika");
        System.out.println("Nama : " +elektronika.nama);
        System.out.println("NIM : " +elektronika.nim);
        System.out.println("Jurusan : " +elektronika.jur);
        System.out.println("Status : " +elektronika.univ);
    }
}
