import java.util.Scanner;
public class T4ej8 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        float nota1 = Float.parseFloat(s.nextLine());

        System.out.print("Introduce la nota del segundo examen: ");
        float nota2 = Float.parseFloat(s.nextLine());

        System.out.print("Introduce la nota del tercer examen: ");
        float nota3 = Float.parseFloat(s.nextLine());

        float media = (nota1 + nota2 + nota3) / 3;

        if (media < 0 || media > 10) {
            System.out.println("Una o varias de las notas introducidas no son válidas.");
            return;
        }

        System.out.printf("La media de las tres notas es: %.2f\n", media);

        if ( media > 0 && media < 5) {
            System.out.println("Insuficiente");
        } else if (media >= 5 && media < 6) {
            System.out.println("Suficiente");
        } else if (media >= 6 && media < 7) {
            System.out.println("Bien");
        } else if (media >= 7 && media < 9) {
            System.out.println("Notable");
        } else if (media >= 9 && media <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("La nota introducida no es válida.");
        }

 


    }
}