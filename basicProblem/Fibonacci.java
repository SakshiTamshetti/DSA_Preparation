package basicProblem;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(a);

            int c = a + b;
            a = b;
            b = c;

        }

        sc.close();
    }
}
