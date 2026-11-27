import java.util.Scanner;

public class T5ej10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double suma = 0;
        int contador = 0;

        System.out.println("Introduce números positivos (un número negativo para terminar):");
        double numero = s.nextDouble();

        while (numero >= 0) {
            suma += numero;
            contador++;
            numero = s.nextDouble();
        }

        if (contador > 0) {
            double media = suma/contador;
            System.out.print("la media es: " + media);
        }
    }    
}
