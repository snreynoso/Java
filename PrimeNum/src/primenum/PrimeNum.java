package primenum;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        boolean prime;

        for (int i = 0; i< a.length; i++) {
            prime = true;

            if(a[i]==1) {
                System.out.println("Not prime");
            } else {
                for (int j = 2; j * j <= a[i]; j++) {
                    if (a[i] % j == 0) {
                        prime = false;
                    }
                }

                if (prime) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
            }
        }
    }
}
