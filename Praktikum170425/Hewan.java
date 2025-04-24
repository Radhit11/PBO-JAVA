
package Praktikum170425;


public class Hewan {
    protected String nama;
    
    public Hewan(String nama) {
        this.nama=nama;
        
    }
    
    public void bersuara(){
        System.out.println("Hewan Bersuara....");
        
    }
    
    public void tampilkanNama(){
        System.out.println("Nama hewan"+nama);
    }
    
    
}
