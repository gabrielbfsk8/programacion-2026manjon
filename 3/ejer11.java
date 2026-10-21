import java.util.Scanner;
public class ejer11 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Valor en Kb");
        float Kb = s.nextFloat();
        double conversor = Kb / 1024;
        System.out.printf("Tienes %.3f Mb\n", conversor);

    }
}
