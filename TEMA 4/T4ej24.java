import java.util.Scanner;

public class T4ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = sc.nextInt();

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int dias = sc.nextInt();

        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estado = sc.nextInt();

        double sueldoBase = 0;
        if (cargo == 1) sueldoBase = 950;
        if (cargo == 2) sueldoBase = 1200;
        if (cargo == 3) sueldoBase = 1600;

        double dietas = dias * 30;
        double bruto = sueldoBase + dietas;

        int irpf = 20;
        if (estado == 1) irpf = 25;

        double retencion = bruto * irpf / 100;
        double neto = bruto - retencion;

        System.out.println();
        System.out.println(" Sueldo base            " + sueldoBase);
        System.out.println(" Dietas (" + dias + " viajes)      " + dietas);
        System.out.println();
        System.out.println(" Sueldo bruto           " + bruto);
        System.out.println(" Retención IRPF (" + irpf + "%)   " + retencion);
        System.out.println();
        System.out.println(" Sueldo neto            " + neto);
    }
}
