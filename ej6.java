import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, dime cómo te llamas: ");
        String nombre = teclado.nextLine();

        System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");

        teclado.close();
    }
}