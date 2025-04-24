
package Praktikum170425;


public class MainHewan {

   
    public static void main(String[] args) {
        Hewan hewanku=new Hewan("Makhluk hidup");
        Kucing kucingku=new Kucing("Boby");
        Anjing anjingku=new Anjing("Helly");
        System.out.println("tampilkan akses super class hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        System.out.println("tampilkan akses sub class kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        System.out.println("tampilkan akses sub class anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
    }
    
}
