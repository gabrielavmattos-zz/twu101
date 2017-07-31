package prime;

import java.util.ArrayList;

public class Prime {


    public ArrayList<Integer> generate(int n){

        ArrayList<Integer> listPrimesFactores = new ArrayList<Integer>();


        for(int i = 2; i <= n; i++)
            if (n % i == 0) {
                n = n / i;
                listPrimesFactores.add(i);
            }

        return listPrimesFactores;

    }

    public static void main(String[] args) {

        Prime primes = new Prime();

        ArrayList<Integer> list = primes.generate(1);

        System.out.println(list);

        list = primes.generate(30);

        System.out.println(list);

    }

}