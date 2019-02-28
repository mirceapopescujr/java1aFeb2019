public class Exemplu12{
    public static void main (String [] args){
        Pisica p1;
        p1 = new Pisica("TOM");
        
        
        p1.culoare="alb";
        p1.greutate=10;
        
        
        Pisica p2= new Pisica("Leo");
        
        p2.culoare="negru";
        p2.greutate=3;
        
        System.out.println(p1);
        
        System.out.println(p2);
    }
}