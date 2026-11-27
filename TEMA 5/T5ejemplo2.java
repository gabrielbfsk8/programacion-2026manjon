import java.util.Scanner;

public class T5ejemplo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entero\n");
            numero = s.nextInt();
        } while (numero % 2 == 0 && numero > 6 && numero < 11);

        System.out.println("fin bucle");
    }
}
