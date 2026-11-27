import java.util.Scanner;

public class T5ej25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el numero que quieres ver al reves: ");
        int numero = s.nextInt();

        System.out.println("Introduce los digitos del numero: ");
        int digitos = s.nextInt();

        for (int i = 1; i <= digitos; i++) {
            int diddy = (numero % 10);
            System.out.print(diddy);
            numero = numero / 10;
        }
    }
}
