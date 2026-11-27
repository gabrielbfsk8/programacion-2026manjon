import java.util.Scanner;

public class T5ej30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dia1, hora1, dia2, hora2;

        do {
            System.out.println("Introduce la primera hora:");
            System.out.print("Día (1-7): ");
            dia1 = s.nextInt();
            System.out.print("Hora (0-23): ");
            hora1 = s.nextInt();

            if (dia1 < 1 || dia1 > 7 || hora1 < 0 || hora1 > 23) {
                System.out.println("Datos incorrectos. Inténtalo de nuevo.\n");
            }
        } while (dia1 < 1 || dia1 > 7 || hora1 < 0 || hora1 > 23);

        do {
            System.out.println("\nIntroduce la segunda hora:");
            System.out.print("Día (1-7): ");
            dia2 = s.nextInt();
            System.out.print("Hora (0-23): ");
            hora2 = s.nextInt();

            if (dia2 < 1 || dia2 > 7 || hora2 < 0 || hora2 > 23) {
                System.out.println("Datos incorrectos. Los días son del 1 al 7 y las horas de 0 a 23.");
            } else if (dia2 < dia1 || (dia2 == dia1 && hora2 < hora1)) {
                System.out.println("El segundo día y hora deben ser posteriores al primero.");
            }
        } while (dia2 < 1 || dia2 > 7 || hora2 < 0 || hora2 > 23 || dia2 < dia1 || (dia2 == dia1 && hora2 < hora1));

        int horasTranscurridas = 0;
        int diaActual = dia1;
        int horaActual = hora1;

        while (diaActual < dia2 || horaActual < hora2) {
            horaActual++;
            horasTranscurridas++;

            if (horaActual == 24) {
                horaActual = 0;
                diaActual++;
            }
        }

        System.out.println("\nEntre las " + hora1 + ":00h del día " + dia1 + " y las " + hora2 + ":00h del día " + dia2 + " hay " + horasTranscurridas + " hora/s.");

        s.close();
    }
}
