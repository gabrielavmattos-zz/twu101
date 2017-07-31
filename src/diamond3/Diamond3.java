package diamond3;

/*
Diamond with Name

Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:

  *
 ***
Bill
 ***
  *
 */

public class Diamond3 {

    public void printDiamond(int n) {

        for(int i = 1; i <= n - 1; i++) {
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");
            for(int j = 0; j < (i * 2 - 1); j++)
                System.out.print("*");
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");
            System.out.println();
        }
        System.out.println("Gabriela");
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");
            for(int j = 0; j < (i * 2 - 1); j++)
                System.out.print("*");
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Diamond3 diamond3 = new Diamond3();

        diamond3.printDiamond(3);
    }
}
