public class Exemplul4{
    public static void main (String [] args){
    
        String s1 = "Ana are " + 3+4+" mere";
        System.out.println(s1);// afiseaza ana are 34 mere
        
        String s2 = "Ana are " + (3+4)+" mere";
        System.out.println(s2);// afiseaza ana are 7 mere
        
        String s3 = 3+4 +" mere are Ana";
        System.out.println(s3);// afiseaza 7 mere are ana
    }
}