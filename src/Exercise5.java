import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int[] num = new int[10];

        Scanner scan = new Scanner(System.in);
        System.out.println("Write 10 numbers");

        for (int i = 0; i < 10; i++) {
            System.out.print("number " + (i + 1) + " = ");
            num[i] = scan.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
             System.out.print(num[i] + " ");
        }
    }
}
