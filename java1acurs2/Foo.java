public class Foo{//Foo Bar BAz
    
    
    void modificaSuma(double suma){
        suma=1000;
    }
    
    void modificaCont(Cont cont){
        cont.titular="Bill";
    }
    
    
    public static void main (String [] args){
        Foo f = new Foo();
        double suma = 500;
        f.modificaSuma(suma);
        
        System.out.println(suma);//500
    
    }
}