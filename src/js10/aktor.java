
package js10;

/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class aktor {
    String nama;
    int umur;
    
    aktor(String n, int u){
        nama = n;
        umur = u;
    }
    
    void tampilAktor(){
        System.out.println("Namaku : " +nama);
        System.out.println("Umurku : " +umur+ " Tahun");
    }
    
    public static void main(String args[]){
        aktor a;
        
        a = new aktor("Ronaldo" , 33);
        a.tampilAktor();
        System.out.println("=========");
        
        a = new aktor("Messi", 34);
        a.tampilAktor();
        System.out.println("=========");
    }
}
