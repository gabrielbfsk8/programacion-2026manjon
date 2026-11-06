import java.util.Scanner;
public class T4ej14 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número entero\n");
        int numero = s.nextInt();


        if (numero % 2 == 0 && numero % 5 == 0) {
            System.out.print("El número es par y es multiplo de 5");
        } else if (numero % 2 == 0 && numero % 5 != 0) {
            System.out.print("El número es par y no es múltiplo de 5");
        } else if (numero % 2 != 0 && numero % 5 == 0) {
            System.out.print("El número es impar y es múltiplo de 5");
        } else {
            System.out.print("El número es impar y no es múltiplo de 5");
        }
        


 


    }
}