import java.util.Scanner;
public class T4ej18 {
    public static void main(String[] args) {
        
        //Máximo 5 dígitos (numero introducido por el usuario) --> entre 1 < numero < 99999.
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número entero, de máximo 5 dígitos\n");
        int numero = s.nextInt();

        if (numero < 1 || numero > 99999) {
            System.out.print("El número introducido no es válido.");
        }

        //si el numero tiene 1 digito, entre 1 < numero < 9
        else if (numero >= 1 && numero <= 9) {
            System.out.print("El primer dígito del número es: " + numero);
        }

        //si el numero tiene 2 digitos, entre 10 < numero < 99
        //dividimos numero/10 para obtener el primer dígito
        else if (numero >= 10 && numero <= 99) {
            System.out.print("El primer dígito del número es: " + (numero / 10));
        }

        //si el numero tiene 3 digitos, entre 100 < numero < 999
        //dividimos numero/100 para obtener el primer dígito
        else if (numero >= 100 && numero <= 999) {
            System.out.print("El primer dígito del número es: " + (numero / 100));
        }

        //si el numero tiene 4 digitos, entre 1000 < numero < 9999
        //dividimos numero/1000 para obtener el primer dígito   
        else if (numero >= 1000 && numero <= 9999) {
            System.out.print("El primer dígito del número es: " + (numero / 1000));
        }

        //si el numero tiene 5 digitos, entre 10000 < numero < 99999
        //dividimos numero/10000 para obtener el primer dígito
        else if (numero >= 10000 && numero <= 99999) {
            System.out.print("El primer dígito del número es: " + (numero / 10000));
        }




    }
}