package Praktikum130325;


public class Kendaraan {
    String jenis;
    int tahun;
    String warna;
    
    ///constructor
    public Kendaraan(String j, int t,String w){
        this.jenis=j;
        this.tahun=t;
        this.warna=w;
    }
        
        public void TampilData(){
            System.out.println("Jenis Kendaraan ="+jenis);
            System.out.println("Warna Kendaraan ="+warna);
            System.out.println("Tahun Keluaran ="+tahun);
        }
        
        ///method dengan parameter
        public void TipeKendaraan(int kec){
            System.out.println("Tipe Kendaraan Anda ");
            if(kec<20){
            System.out.println("Lebih Baik Jalan");
            }
            else if(kec<40)
                System.out.println("slow");
            else if(kec<80)
                System.out.println("Standar");
            else if(kec<100)
                System.out.println("Fast");
            else 
                System.out.println("Racing car!!!");
        }
    }
    
