import java.util.Scanner;
public class ejer5 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Base del rectangulo?");

        float base = Float.parseFloat(s.nextLine());

        System.out.print("Altura del rectangulo?");
        float alt = Float.parseFloat(s.nextLine());

        float area = (base*alt);

        //
        System.out.println("          " + base);
        System.out.println("-----------------------");
        System.out.println("|.                    |");
        System.out.println("|                     | " + alt);
        System.out.println("|                    .|");
        System.out.println("-----------------------\n");
        System.out.printf("El area de este rectangulo es de " + area + " unidades^2\n");

    }
}