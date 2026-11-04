import java.util.Scanner;

class SentenciaSwitch {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca un dia de la semana (1-7): ");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        String nombreDelDia;

        switch (dia) {
            case 1:
                nombreDelDia = "lunes";
                break;
            case 2:
                nombreDelDia = "martes";
                break;
            case 3:
                nombreDelDia = "miércoles";
                break;
            case 4:
                nombreDelDia = "jueves";
                break;
            case 5:
                nombreDelDia = "viernes ";
                break;
            default:
                nombreDelDia = "No es dìa lectivo";
        }

        System.out.println("Dìa " + dia + ": " + nombreDelDia);
    }
}
