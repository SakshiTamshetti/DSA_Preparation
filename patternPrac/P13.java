import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int os = num / 2;
        int is = -1;

        for (int i = 1; i <= num; i++) {
            // System.out.println(os+";"+is);

            for (int j = 1; j <= os; j++) {
                System.out.print(" ");
            }
                System.out.print("* ");

            for (int j = 1; j <= is; j++) {
                System.out.print(" ");
            }

            if (i > 1 && i < num) {
                System.out.print("* ");

            }

            if (i <= num / 2) {
                os--;
                is += 2;
            } else {
                os++;
                is -= 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
