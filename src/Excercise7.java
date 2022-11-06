import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args) {
        final char[] LETTERS = {'T','R','W','A','G','M','Y','F',
                'P','D','X','B','N','J','Z','S','Q','V',
                'H','L','C','K','E' };
        int num_dni;

        Scanner scan = new Scanner(System.in);
        System.out.println("Write dni: ");
        num_dni = scan.nextInt();
        System.out.println("The letter is " + LETTERS[num_dni % 23]);
    }
}
