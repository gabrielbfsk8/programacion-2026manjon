public class T5ejemplo {
    public static void main(String[] args) {

     for (int i = 1; i < 101; i++) {
        System.out.print(i + "\n");
     }

    //PARES
    // for (int j = 1; j < 101; j++) {
    //    if (j % 2 == 0) {
    //        System.out.println(j);
    //    } 
    // }

    for (int j = 1; j < 101; j=j+2) {
            System.out.println("PA: " + j);
    }

    //IMPARES
    // for (int k = 1; k < 101; k++) {
    //    if (k % 2 != 0) {
    //        System.out.println(k);
    //    }
    // }

    for (int k = 1; k < 101; k = (2*k + 1)) {
        System.out.println("IMP: " + k);
    }

    for (int l = 1; l < 101; l--) {
        System.out.println("R: " + l);
    }
    }
}