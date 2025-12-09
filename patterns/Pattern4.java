package patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int space = 0;
        int star = num;

        for (int i = 1; i <= num; i++) {
           // System.out.print(space+","+star);

            
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
           
            space++;
            star--;
            System.out.println();
        }

        sc.close();
    }

}
