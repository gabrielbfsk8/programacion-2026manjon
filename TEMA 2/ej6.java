public class ej6
{
    public static void main(String[] args) 
    {
        double iva = 0.21;
        int precio1 = 1;
        int precio2 = 15;

        System.out.println("Suponemos que el IVA es de 21%");
        System.out.println("precio sin IVA = " + precio1);
        System.out.println("con IVA = " + ((precio1*iva)+ precio1));
        System.out.println("segundo precio sin IVA = " + precio2);
        System.out.println("con IVA = " + ((precio2*iva)+precio2));

    }
    
}