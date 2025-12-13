package patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int space = num / 2;
        int star = 1;

        for (int i = 1; i <= num; i++) {

            //System.err.print(space + "," + star);

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }

            if (i <= num / 2) {
                space--;
                star+=2;
            } else {

                space++;
                star-=2;
                
            }
            System.out.println();

        }

        sc.close();
    }
}
