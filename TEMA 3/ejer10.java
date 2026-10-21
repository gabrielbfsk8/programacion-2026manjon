import java.util.Scanner;
public class ejer10 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Valor en Mb");
        float Mb = s.nextFloat();
        double conversor = Mb * 1024;
        System.out.printf("Tienes %.3f Kb\n", conversor);

    }
}
