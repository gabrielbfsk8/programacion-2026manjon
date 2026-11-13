import java.util.Scanner;
public class T4ej6 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Altura inicial de donde cae el objeto? -> ");
        float altura = Float.parseFloat(s.nextLine());

        if (altura > 0) 
        {
            float tiempo = (float) Math.sqrt((2 * altura) / 9.81);
            System.out.printf("Tiempo de caida: %.2f segundos\n", tiempo);
        } 
        else 
        {
            System.out.println("Altura introducida no válida");
        }

 


    }
}