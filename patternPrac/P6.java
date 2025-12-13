import java.util.Scanner;

public class P6 {

    public static void main(String[] args) {
        
           Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int star=num-1;
        int space=1;

        for(int i=1;i<=num;i++){

            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=star; j++) {
                System.out.print("* ");
            }
            space++;
            star--;
            System.out.println();
        }

        sc.close();

    }
}
