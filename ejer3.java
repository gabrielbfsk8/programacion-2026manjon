import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Cuantas pesetas tienes?");
        float pesetas = s.nextFloat();
        double conversor = pesetas/166.386;
        System.out.printf("Tienes %.3f Euros\n", conversor);

    }
}
