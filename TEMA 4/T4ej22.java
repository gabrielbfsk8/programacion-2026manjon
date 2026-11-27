import java.util.Scanner;

public class T4ej22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un día de la semana (lunes a viernes)(0-4): ");
        String dia = teclado.nextLine().toLowerCase();

        System.out.print("Introduce la hora (0-23): ");
        int horas = teclado.nextInt();

        System.out.print("Introduce los minutos (0-59): ");
        int minutos = teclado.nextInt();

        int diaNum = 0;

        switch (dia) {
            case "lunes":
                diaNum = 0;
                break;
            case "martes":
                diaNum = 1;
                break;
            case "miércoles":
                diaNum = 2;
                break;
            case "jueves":
                diaNum = 3;
                break;
            case "viernes":
                diaNum = 4;
                break;
        }

        // Total de minutos desde el lunes 00:00 hasta el viernes 15:00 (6660 minutos)
        int minutosTotalesFinde = (4 * 24 * 60) + (15 * 60);

        // Minutos actuales desde el lunes 00:00
        int minutosActuales = (diaNum * 24 * 60) + (horas * 60) + minutos;

        int minutosRestantes = minutosTotalesFinde - minutosActuales;

        System.out.println("Faltan " + minutosRestantes + " minutos para llegar al fin de semana.");
        
    }
}
