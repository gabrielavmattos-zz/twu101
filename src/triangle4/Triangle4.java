package triangle4;

/*
Draw a right triangle

Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
Example when n=3:
*
**
***
 */

public class Triangle4 {

    public void printTriangle(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Triangle4 triangle = new Triangle4();

        triangle.printTriangle(3);
    }
}
