public class Cont{
    String titular;
    double sold;
    
    
    Cont(String titular, double sold){
        this.titular=titular;
        this.sold=sold;
    }
    
    void depune(double suma){
        this.sold +=suma;
    }
    
    boolean retrage(double suma){
        
        if (this.sold >=suma){
            this.sold -= suma;
        
            return true;
        }else{
            return false;
        }
    }
    
    void transfera(Cont c, double suma){
        c.retrage(suma);
        this.depune(suma);
    }
}