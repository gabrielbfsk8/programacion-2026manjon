import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Cuantos euros tienes?");
        float euros = s.nextFloat();
        double conversor = euros * 166.386;
        System.out.printf("Tienes %.3f Pesetas\n", conversor);

    }
}