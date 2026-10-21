import java.util.Scanner;
public class ejer12 {
    public static void main(String[] args) {
        
        //teniendo en cuenta que la nota final es la 40% de la nota del primer examen y el 60% de la nota del segundo examen, 
        //para saber lo que tengo que sacar en el segundo examen para obtener una media fina
        
        System.out.print("Inserte la nota del primer examen: ");
        Scanner s = new Scanner(System.in);

        float nota1intro = Float.parseFloat(s.nextLine());
        float nota1 = 0.4f * nota1intro;

        System.out.print("Inserte la nota que quieres sacar de media final: ");
        float media = Float.parseFloat(s.nextLine());

        float nota2 = (2 * media) - nota1;

        System.out.printf("Necesitas sacar un " + nota2 + " en el segundo examen para obtener un " + media + " de media final\n");

    }
}