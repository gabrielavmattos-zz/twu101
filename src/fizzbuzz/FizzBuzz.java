package fizzbuzz;

/*
FizzBuzz Exercise
FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to certain rules.

Create a FizzBuzz() method that prints out the numbers 1 through 100.
Instead of numbers divisible by three print "Fizz".
Instead of numbers divisible by five print "Buzz".
Instead of numbers divisible by three and five print "FizzBuzz".

Sample Output:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
 */

public class FizzBuzz {

    public String numberGame(int i) {
        if(i % 3 == 0 && i % 5 == 0)
            return "FizzBuzz";
        else if (i % 3 == 0)
            return "Fizz";
        else if (i % 5 == 0)
            return "Buzz";
        else
            return Integer.toString(i);
    }

    public void printFizzBuss(int n) {

        for(int i = 1; i <= n; i++)
            System.out.println(numberGame(i));
    }

    public static void main(String[] args) {
        FizzBuzz fizz = new FizzBuzz();

        fizz.printFizzBuss(100);
    }
}
