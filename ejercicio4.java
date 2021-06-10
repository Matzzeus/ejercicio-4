import java.util.*;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayorEdad = 0, menorEdad = 90;
        for (int i = 1 ;  i <= 20; i ++)  {
            int rand = (int)(Math. random() * 90 + 0);
            System.out.println(" ");
            System.out.print("la edad es: " + rand); 
            
            if ( rand > mayorEdad) {
                mayorEdad = rand;
            }
            else if ( rand < menorEdad) {
                menorEdad = rand; 
            }
    }
    System.out.println(" ");
    System.out.print("la edad mayor es: " + mayorEdad + " años ");
    System.out.println(" "); 
    System.out.print("y");
    System.out.println(" ");
    System.out.print("a menor edad es: " + menorEdad + " años");
    }
}