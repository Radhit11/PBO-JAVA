
package Praktikum150525;

public class Taksi extends Mobil{
    protected int tarifAwal;
    protected int tarifPerKm;
    
    public Taksi(){
        
    }
    public Taksi(int tarifAwal, int tarifPerKm, String bahanBakar, int kapasitasMesin, int jmlRoda, String warna){
        super(bahanBakar,kapasitasMesin,jmlRoda,warna);
        this.tarifAwal=tarifAwal;
        this.tarifPerKm=tarifPerKm;
    }
    public void setTarifAwal( int tarifAwal){
        this.tarifAwal=tarifAwal;
    }
    public int getTarifAwal(){
        return tarifAwal;
    }
    public void setTarifPerKm( int tarifPerKm){
        this.tarifPerKm=tarifPerKm;
    }
    public int getTarifPerKm(){
        return tarifPerKm;
    }
    public void display(){
    System.out.println("Kelas Truk");
    System.out.println("Warna = "+this.warna);
    System.out.println("Jumlah Roda = "+this.jmlRoda);
    System.out.println("Tarif Awal = "+this.tarifAwal);
    System.out.println("Tarif Per Km = "+this.tarifPerKm);
    System.out.println("Jumlah Jenis Bahan Bakar = "+this.bahanBakar);
    System.out.println("Kapasitas Mesin = "+this.kapasitasMesin);
    }
}

