package basicProblem;

import java.util.Scanner;

public class Revere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0) {
            int dig = num % 10;
            num = num / 10;
            System.out.print(dig);
        }

        sc.close();
    }
}