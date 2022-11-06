import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        char[][] board = new char[8][8];
        char decirLetra;
        int decirCol;

        //tablero
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; i++) {
                board[i][j] = ' ';
            }
        }

        //colocacion barcos
        int cont = 0;

        while (cont < 10) {
            int x = (int) (Math.random() * 10); //derecha-izquierda
            int y = (int) (Math.random() * 10); //arriba-abajo
        }

        //decir coordenadas (letra y numero)
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe una letra: ");
        decirLetra = scan.next().charAt(0);
        System.out.println("Escribe una columna: ");
        decirCol = scan.nextInt();


    }
}
