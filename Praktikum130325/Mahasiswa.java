
package Praktikum130325;


public class Mahasiswa {
    int nim;
    String nama;
    int tgs;
    int uts;
    int uas;
    int quiz;
    double nilaiakhir;
    
 
    
    
    public Mahasiswa (long ni, String na, int tu ,int qu , int ut , int ua ){
        
        this.nim=(int) ni;
        this.nama=na;
        this.tgs=tu;
        this.quiz=qu;
        this.uts=ut;
        this.uas=ua;
    }
    
    public void TampilData(){
        System.out.println("NIM Mahasiswa    = "+nim);
        System.out.println("Nama Mahasiswa   = "+nama);
        System.out.println("Nilai Tugas      = "+tgs);
        System.out.println("Nilai Quiz       = "+quiz);
        System.out.println("Nilai UTS        = "+uts);
        System.out.println("Nilai UAS        = "+uas);
    }
    public void NilaiAkhir(){
        nilaiakhir = tgs*0.15 + quiz*0.2 + uts*0.3 + uas*0.35;
        System.out.print("Nilai Akhir     = "+nilaiakhir);
    }
    public void KonversiNilai(){
        System.out.print("Nilai Akhir Anda = ");
        
        if(nilaiakhir<40){
            System.out.println("E");
            System.out.println("Tidak Memuaskan ");
        }
        else if (nilaiakhir<50){
            System.out.println("D");
        }
        else if (nilaiakhir<65){
            System.out.println("C");
        }
        else if (nilaiakhir<80){
            System.out.println("B");
        }
        else
            System.out.println("A");
    }
    
}