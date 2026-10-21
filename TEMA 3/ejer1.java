import java.util.Scanner;
public class ejer1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce dosq números (pueden contener decimales) separados por espacios: ");
        double x = s.nextDouble();
        double y = s.nextDouble();
        double mult = (x * y);
        System.out.println("La multiplicación de esos tres números es " + mult);

    }
}
