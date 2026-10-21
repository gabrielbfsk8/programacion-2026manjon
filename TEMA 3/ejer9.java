import java.util.Scanner;
public class ejer9 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Radio del cono?");
        float radio = Float.parseFloat(s.nextLine());
        
        System.out.print("Altura del cono?");
        float altura = Float.parseFloat(s.nextLine());

        float volumen = (1f/3f * (3.14f) * radio * radio * altura);

        System.out.printf("Volumen: %.2f unidades\n", volumen);

    }
}