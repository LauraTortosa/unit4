public class Exercise8 {
    public static void main(String[] argv) {
        int[][] array = new int[10][10]; //declaracion

        //asignar valores
        array[0][4] = 1;
        array[2][6] = 1;
        array[3][1] = 1;
        array[8][6] = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
