import java.util.Scanner;
public class ejer7 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Pon tu factura");

        float fac = Float.parseFloat(s.nextLine());

        float bi = 0.21f * fac;

        System.out.printf("Valor Total: %.2f euros\n", bi + fac);

    }
}