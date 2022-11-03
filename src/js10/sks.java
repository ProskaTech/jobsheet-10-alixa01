/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js10;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class sks {
    String nama = "Joni", smt = "V";
    int nim = 12345, sks;
    double ip = 3.50;
    
    public void hitungSks(){
        if(ip >= 3.5){
            sks = 24;
        }
        else if(ip >= 3.0){
            sks = 22;
        }
        else if(ip >= 2.5){
            sks = 20;
        }
        else if(ip >= 2.0){
            sks = 18;
        }
        else {
            sks = 15;
        }
    }
    public void tampilData(){
        System.out.println("Nama mahasiswa \t\t: " +nama);
        System.out.println("NIM \t\t\t: " +nim);
        System.out.println("Semester \t\t: " +smt);
        System.out.println("IP Semester ini \t: " +ip);
        System.out.println("Anda berhak mengontrak " +sks+ " SKS pada Semester " +smt);
    }
    
    public static void main(String args[]){
        sks a = new sks();
        a.hitungSks();
        a.tampilData();
    }
}
