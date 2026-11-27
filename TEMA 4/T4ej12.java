import java.util.Scanner;

public class T4ej12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int puntos = 0;
        String respuesta;

        System.out.println("1. ¿Qué tipo de dato almacena números enteros?");
        System.out.println("A) int  B) String  C) boolean");
        respuesta = teclado.nextLine().toUpperCase();
        if (respuesta.equals("A")) {
            puntos++;
        }

        System.out.println("2. ¿Qué símbolo termina normalmente una instrucción en Java?");
        System.out.println("A) :  B) ;  C) ,");
        respuesta = teclado.nextLine().toUpperCase();
        if (respuesta.equals("B")) {
            puntos++;
        }

        System.out.println("3. ¿Qué palabra se usa para declarar una constante?");
        System.out.println("A) final  B) const  C) static");
        respuesta = teclado.nextLine().toUpperCase();
        if (respuesta.equals("A")) {
            puntos++;
        }

        System.out.println("4. ¿Qué estructura repite instrucciones mientras se cumpla una condición?");
        System.out.println("A) if  B) while  C) switch");
        respuesta = teclado.nextLine().toUpperCase();
        if (respuesta.equals("B")) {
            puntos++;
        }

        System.out.println("5. ¿Qué operador comprueba si dos valores son iguales?");
        System.out.println("A) =  B) .equals  C) !=");
        respuesta = teclado.nextLine().toUpperCase();
        if (respuesta.equals("B")) {
            puntos++;
        }

        System.out.println("6. ¿Qué método es el punto de entrada habitual de un programa Java?");
        System.out.println("A) start()  B) main()  C) run()");
        respuesta = teclado.nextLine().toUpperCase();
        if (respuesta.equals("B")) {
            puntos++;
        }

        System.out.println("7. ¿Qué tipo de dato representa verdadero o falso?");
        System.out.println("A) char  B) boolean  C) double");
        respuesta = teclado.nextLine().toUpperCase();
        if (respuesta.equals("B")) {
            puntos++;
        }

        System.out.println("8. ¿Qué palabra permite crear una nueva instancia de una clase?");
        System.out.println("A) new  B) this  C) void");
        respuesta = teclado.nextLine().toUpperCase();
        if (respuesta.equals("A")) {
            puntos++;
        }

        System.out.println("9. ¿Qué estructura permite elegir entre varias opciones?");
        System.out.println("A) switch  B) while  C) import");
        respuesta = teclado.nextLine().toUpperCase();
        if (respuesta.equals("A")) {
            puntos++;
        }

        System.out.println("10. ¿Qué instrucción muestra texto en la consola?");
        System.out.println("A) Scanner  B) System.out.println()  C) Integer.parseInt()");
        respuesta = teclado.nextLine().toUpperCase();
        if (respuesta.equals("B")) {
            puntos++;
        }

        System.out.println("Calificación final: " + puntos + " de 10 puntos.");
        teclado.close();
    }
}
