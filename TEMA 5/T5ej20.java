import java.util.Scanner;

public class T5ej20 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la altura de la piramide: ");
        int altura = s.nextInt();
        System.out.println("Introduce el caracter elegido: ");
        String carac = s.next();
 //Con relleno:
      //  for (int fila = 1; fila <= altura; fila++) {
     //      for (int espacios = 1; espacios <= altura - fila; espacios++) {
     //         System.out.print(" ");
      //  }
        //Para, por ejemplo, fila 1: 2 * (fila) - 1 = 1 => 2 * 1 - 1 = 1 carácter
      //  for (int i = 1; i <= (2 * fila - 1); i++) {
     //       System.out.print(carac);
     //   }

     //   System.out.println();
    //}

    //SIN relleno:

    for (int fila = 1; fila <= altura; fila++) {
            for (int espacios = 1; espacios <= altura - fila; espacios++) {
                System.out.print(" ");
        }

        int anchoFila = 2 * fila - 1;
            for (int j = 1; j <= anchoFila; j++) {
                if (j == 1 || j == anchoFila || fila == altura) {
                    System.out.print(carac);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
    }
}
