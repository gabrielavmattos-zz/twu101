package triangle2;

/*
Draw a horizontal line

Given a number n, print n asterisks on one line.
Example when n=8:
********
 */

public class Triangle2 {

    public void printTriangle(int n) {
        for(int i = 0; i < n; i++)
            System.out.print("*");
    }

    public static void main(String[] args) {
        Triangle2 triangle = new Triangle2();

        triangle.printTriangle(8);
    }
}
