import java.util.Scanner;
public class T4ej10 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introuce el mes de nacimiento (1-12): ");
        int mes = Integer.parseInt(s.nextLine());

        System.out.print("Introduce el día de nacimiento (1-31): ");
        int dia = Integer.parseInt(s.nextLine());

        System.out.print("Tu fecha de nacimiento es: " + dia + "/" + mes);

        String signo = Zodiac(dia, mes);
        System.out.println(" y tu signo del zodiaco es: " + signo);
 


    }
}