/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum150525;

/**
 *
 * @author USER
 */
public class TestPolimorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kendaraan k1 = new Kendaraan(4,"merah");
        k1.display();
        System.out.println("");
        
        Kendaraan k2 = new Mobil("Bensin",1500,4,"Cokelat");
        k2.display();
        System.out.println("");
        
        Mobil k3 = new Truk(10000,"Solar",4000,6,"Biru-Merah");
        k3.display();
        System.out.println("");
        
        Sepeda k4 = new SepedaListrik (2,4,2,"merah",40,50);
        k4.display();
        System.out.println("");
    }
    
}
