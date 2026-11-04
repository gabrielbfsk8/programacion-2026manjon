import java.util.Scanner;

class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero de mes: ");
        String mes = sc.nextLine();
        String nombreDelMes = "";

        switch (mes) {
            case "enero":
                System.out.println("Hace frio");
                break;
            case "febrero":
                System.out.println("Hace frio");
                break;
            case "marzo":
                System.out.println("Hace calor");
                break;
            default:
                System.out.println("No es un mes válido");
        }

        System.out.println("Mes " + mes + ": " + nombreDelMes);
    }
}
