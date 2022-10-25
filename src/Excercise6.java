import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int temp; //variable temporal

        Scanner scan = new Scanner(System.in);
        System.out.println("Write 10 numbers");

        for (int i = 0; i < 10; i++) {
            System.out.print("number " + (i + 1) + " = ");
            num[i] = scan.nextInt();
        }

        for (int i = 0; i < num.length / 2; i++) {
            temp = num[i]; //guarda el actual
            num[i] = num[num.length - 1 - i]; //indice de la otra mitad
            num[i] = temp; //valor actual es el valor contrario

        }

        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }




    }
}
