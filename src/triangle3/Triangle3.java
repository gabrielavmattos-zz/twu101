package triangle3;

/*
Draw a vertical line

Given a number n, print n lines, each with one asterisks
Example when n=3:
*
*
*
 */
public class Triangle3 {

    public void printTriangle(int n) {
        for(int i = 0; i < n; i++)
            System.out.println("*");
    }

    public static void main(String[] args) {
        Triangle3 triangle = new Triangle3();

        triangle.printTriangle(3);
    }
}
