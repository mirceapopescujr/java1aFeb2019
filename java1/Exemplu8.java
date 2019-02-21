public class Exemplu8 {
    public static void main (String [] args){
        char anotimp = 'p';//anotimp dat de p v t i 
        //chart int Strin enum
        
        switch(anotimp){//afiseaza pana la primul break
            case 'v':
                System.out.println("Este cald");
                break;
            
            case 'i':
                System.out.println("Este cald");
                break;
                
            case 'p':
               
            case 't':
                System.out.println("Ploua!");
            default :
                System.out.println(":)");
        }
    }
}