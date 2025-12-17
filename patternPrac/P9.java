import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int star = num / 2 + 1;
        int space = 1;

        for (int i = 1; i <= num; i++) {
            // System.out.println(star + ";" + space + ";" + star);

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            if (i <= num / 2) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }

            System.out.println();
        }

        sc.close();
    }
}
