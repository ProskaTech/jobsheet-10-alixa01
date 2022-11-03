/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js10;

/**
 *
 * @author HP
 */
public class mobilutama {
    public static void main(String[] args){
        mobil honda = new mobil();
        honda.merk = "Civic";
        honda.warna = "Hitam";
        honda.tahunproduksi = 2020;
        System.out.println("Merk\t : " +honda.merk);
        System.out.println("Warna\t : " +honda.warna);
        System.out.println("Tahun\t : " +honda.tahunproduksi);
        honda.maju();
        honda.maju();
        honda.mundur();
    }
}
