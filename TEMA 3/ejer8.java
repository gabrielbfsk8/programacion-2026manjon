import java.util.Scanner;
public class ejer8 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Horas trabajadas? -> A la semana");

        float horas = Float.parseFloat(s.nextLine());

        float sueldo = 12 * horas;

        System.out.printf("Sueldo: %.2f euros a la semana\n", sueldo);

    }
}