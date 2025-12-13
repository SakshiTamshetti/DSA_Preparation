import java.util.Scanner;

public class P2 {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int width=sc.nextInt();

        for(int i=1;i<=height;i++){

            for (int j = 1; j <=width; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();

    }
}
