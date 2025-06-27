
package Praktikum150525;


public class Truk extends Mobil{
    
    protected int muatanMaks;
    
    public Truk(){
    
    }
    public Truk(int muatanMaks, String bahanBakar, int kapasitasMesin, int jmlRoda, String warna){
        super(bahanBakar,kapasitasMesin,jmlRoda,warna);
        this.muatanMaks=muatanMaks;
    }
    
    public void setMuatanMaks( int muatanMaks){
        this.muatanMaks=muatanMaks;
    }
    public int getMuatanMaks(){
        return muatanMaks;
    }
}
   
