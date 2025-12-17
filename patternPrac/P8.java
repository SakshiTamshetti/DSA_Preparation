import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int star = 1;
        int space = num / 2;

        for (int i = 1; i <= num; i++) {
            //System.out.println(space + ";" + star);

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }

            if (i <= num / 2) {
                star += 2;
                space--;
            } else {
                star -= 2;
                space++;
            }

            System.out.println();
        }

        sc.close();
    }
}
