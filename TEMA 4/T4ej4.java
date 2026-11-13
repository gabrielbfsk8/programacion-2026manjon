import java.util.Scanner;
public class T4ej4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Horas trabajadas? -> A la semana");
        float horas = Float.parseFloat(s.nextLine());

        if (horas > 0 && horas <= 40) 
        {
            float sueldo = 12 * horas;
            System.out.printf("Sueldo: %.2f euros a la semana\n", sueldo);
        } else if (horas > 40) 
        {
            float sueldo = 16 * horas;
            System.out.printf("Sueldo: %.2f euros a la semana\n", sueldo);
        } 
        else 
        {
            System.out.println("Horas introducidas no válidas");
        }



    }
}