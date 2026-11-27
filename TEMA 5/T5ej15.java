import java.util.Scanner;

public class T5ej15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el numero base: ");
        int numero = s.nextInt();
        System.out.println("Introduce el numero expoente: ");
        int expo = s.nextInt();

        for (int i = 1; i <= expo; i++) {
            System.out.println(numero + "^" + i);
        }
    }
}
