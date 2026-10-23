import java.util.Scanner;
public class ejer12 {
    public static void main(String[] args) {
        
        //teniendo en cuenta que la nota final es la 40% de la nota del primer examen y el 60% de la nota del segundo examen, 
        //para saber lo que tengo que sacar en el segundo examen para obtener una media fina
        
        Scanner s = new Scanner(System.in);

        System.out.print("Inserte la nota del primer examen: ");

        float nota1intro = Float.parseFloat(s.nextLine());
        float nota1 = 0.4f * nota1intro;

        System.out.print("Inserte la nota que quieres sacar de media final: ");
        float media = Float.parseFloat(s.nextLine());
        
        //Formula de la media final: media = 0.4 * nota1 + 0.6 * nota2, por lo tanto, nota2 = (media - 0.4 * nota1) / 0.6

        float nota2 = (media - nota1) / 0.6f;

        System.out.printf("Necesitas sacar un " + nota2 + " en el segundo examen para obtener un " + media + " de media final\n");

    }
}