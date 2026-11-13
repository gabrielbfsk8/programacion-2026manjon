import java.util.Scanner;
public class T4ej16 {
    public static void main(String[] args) {
        
        int puntos = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Contesta las preguntas con Y (Sí) o N (No)\n");

        System.out.print("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente? \n");
        String respuesta1 = s.nextLine();
        if (respuesta1.equals("Y")) {
            puntos += 3;
        } else if (respuesta1.equals("N")) {
            puntos += 0;
        }

        System.out.print("Ha aumentado sus gastos de vestuario? \n");
        String respuesta2 = s.nextLine();
        if (respuesta2.equals("Y")) {
            puntos += 3;
        } else if (respuesta2.equals("N")) {
            puntos += 0;
        }

        System.out.print("Ha perdido el interés que mostraba anteriormente por ti? \n");
        String respuesta3 = s.nextLine();
        if (respuesta3.equals("Y")) {
            puntos += 3;
        } else if (respuesta3.equals("N")) {
            puntos += 0;
        }

        System.out.print("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)? \n");
        String respuesta4 = s.nextLine();
        if (respuesta4.equals("Y")) {
            puntos += 3;
        } else if (respuesta4.equals("N")) {
            puntos += 0;
        }

        System.out.print("No te deja que mires la agenda de su teléfono móvil? \n");
        String respuesta5 = s.nextLine();
        if (respuesta5.equals("Y")) {
            puntos += 3;
        } else if (respuesta5.equals("N")) {
            puntos += 0;
        }

        System.out.print("A veces tiene llamadas que dice no querer contestar cuando estás tú delante \n");
        String respuesta6 = s.nextLine();
        if (respuesta6.equals("Y")) {
            puntos += 3;
        } else if (respuesta6   .equals("N")) {
            puntos += 0;
        }

        System.out.print("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a? \n");
        String respuesta7 = s.nextLine();
        if (respuesta7.equals("Y")) {
            puntos += 3;
        } else if (respuesta7.equals("N")) {
            puntos += 0;
        }

        System.out.print("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo? \n");
        String respuesta8 = s.nextLine();
        if (respuesta8.equals("Y")) {
            puntos += 3;
        } else if (respuesta8.equals("N")) {
            puntos += 0;
        }

        System.out.print("Has notado que últimamente se perfuma más? \n");
        String respuesta9 = s.nextLine();
        if (respuesta9.equals("Y")) {
            puntos += 3;
        } else if (respuesta9.equals("N")) {
            puntos += 0;
        }

        System.out.print("Se confunde y te dice que ha estado en sitios donde no ha ido contigo? \n");
        String respuesta10 = s.nextLine();
        if (respuesta10.equals("Y")) {
            puntos += 3;
        } else if (respuesta10.equals("N")) {
            puntos += 0;
        }

        // Evaluación de los puntos obtenidos
        System.out.println("Puntos obtenidos: " + puntos + ";" + " según el resultado obtenido");
        if (puntos >= 0 && puntos <= 10) {
            System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (puntos >= 11 && puntos <= 22) {
            System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (puntos >= 22 && puntos <= 30) {
            System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        }





    }
}