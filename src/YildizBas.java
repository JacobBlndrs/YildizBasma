
import java.util.Scanner;

public class YildizBas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;
        System.out.print("Bir deger giriniz :");
        n = inp.nextInt();

        int tempN = n;

        int result = 0;

        for (int i = 0; i <= tempN; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");

            }
                for (int k = 1; k <= 2 * i + 1; k++) {
                    System.out.print("*");
                }
            System.out.println();
            }


            for (int l = n-1; l >= 0; l--) {

                for (int o = n - l; o >= 0; o--) {
                    System.out.print(" ");
                }
                for (int m = 2 * l + 1; m >= 1; m--) {
                    System.out.print("*");
                }
                System.out.println();
            }

    }      }


