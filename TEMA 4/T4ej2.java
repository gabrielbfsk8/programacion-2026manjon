import java.util.Scanner;

class T4ej2 {
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca una hora del dia: ");
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();

        if (hora > 6 && hora < 12) {
            System.out.println("Buenos días");
        } else if (hora > 13 && hora < 20) {
            System.out.println("Buenas tardes");
        } else if (hora > 21 && hora < 23) {
            System.out.println("Buenas noches");
        } else if (hora > 0 && hora < 6) {
            System.out.println("Buenas noches");
        } 
        else {
            System.out.println("La hora introducida no es válida.");
        }
    }
}
