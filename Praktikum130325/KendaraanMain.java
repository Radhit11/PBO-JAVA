
package Praktikum130325;

import java.util.Scanner;

public class KendaraanMain {
    
    public static void main(String[] args){
    String jns;
    int thn;
    String wrn;
    int v;
    
    Scanner in=new Scanner(System.in);
    ///meminta input 
    System.out.print("Masukkan jenis Kendaraan = ");
    jns =in.nextLine();
    System.out.print("Tahun Keluaran = ");
    thn = in.nextInt();
    in.nextLine();
    System.out.print("Warna kendaraan = ");
    wrn = in.nextLine();
    /// inputkan data kecepatan max kendaraan
    System.out.print("Masukan Data Kecepatan Max per jam kendaraan");
    v=in.nextInt();
    
    ///deklarasikan objek
    Kendaraan mobil1 = new Kendaraan(jns,thn,wrn);
    System.out.println("\n--Informasi Kendaraan 1--");
    mobil1.TampilData();
    
    mobil1.TipeKendaraan(v);
    }
}
