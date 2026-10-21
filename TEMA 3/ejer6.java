import java.util.Scanner;
public class ejer6 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Base del triangulo?");

        float base = Float.parseFloat(s.nextLine());

        System.out.print("Altura del triangulo?");
        float alt = Float.parseFloat(s.nextLine());

        float area = (base*alt)/2;

        System.out.printf("El area de este triangulo es de " + area + " unidades^2\n");

    }
}