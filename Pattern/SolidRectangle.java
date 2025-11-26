package Pattern;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the rectangle: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns for the rectangle: ");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        sc.close();
    }

}
