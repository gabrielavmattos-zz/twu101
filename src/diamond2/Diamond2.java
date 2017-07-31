package diamond2;

/*
Diamond

Given a number n, print a centered diamond. Example for n=3:

  *
 ***
*****
 ***
  *
 */
public class Diamond2 {

    public void printDiamond(int n) {

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");
            for(int j = 0; j < (i * 2 - 1); j++)
                System.out.print("*");
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");
            System.out.println();
        }
        for(int i = n; i >= 1; i--) {
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
        Diamond2 diamond2 = new Diamond2();

        diamond2.printDiamond(3);
    }


}
