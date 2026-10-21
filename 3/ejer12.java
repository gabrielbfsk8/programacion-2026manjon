import java.util.Scanner;
public class ejer12 {
    public static void main(String[] args) {
        
        //teniendo en cuenta que la nota final es la media de los dos examenes, para sacar la nota del segundo examen, se hace la siguiente formula:
        //si media = (nota1 + nota2) / 2, entonces nota2 = (2 * media) - nota1
        
        System.out.print("Inserte la nota del primer examen: ");
        Scanner s = new Scanner(System.in);

        float nota1 = Float.parseFloat(s.nextLine());

        System.out.print("Inserte la nota que quieres sacar de media final: ");
        float media = Float.parseFloat(s.nextLine());

        float nota2 = (2 * media) - nota1;

        System.out.printf("Necesitas sacar un " + nota2 + " en el segundo examen para obtener un " + media + " de media final\n");

    }
}