import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce dosq números (pueden contener decimales) separados por espacios: ");
        float x = s.nextFloat();
        float y = s.nextFloat();
        float mult = (x * y);
        float sum = (x + y);
        float sub = (x - y);
        float frac = (x / y);
        System.out.printf("La multiplicación de esos tres números es %.2f\n", mult);
        System.out.printf("La suma de esos tres números es %.2f\n", sum);
        System.out.printf("La resta de esos tres números es %.2f\n", sub);
        System.out.printf("La división de esos tres números es %.2f\n", frac);

    }
}