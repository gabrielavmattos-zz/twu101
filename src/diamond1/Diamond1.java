package diamond1;

/*
Isosceles Triangle

Given a number n, print a centered triangle. Example for n=3:
  *
 ***
*****
 */
public class Diamond1 {

    public void printIsosceles(int n) {

        for(int i = 1; i <= n; i++) {
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
        Diamond1 diamond1 = new Diamond1();

        diamond1.printIsosceles(5);
    }


}
