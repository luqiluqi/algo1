package pl.sda.before;

import java.util.ArrayList;

public class MultidimensionalArrays {


    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        int tab[][] = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 8, 9}
        };
        printArray(tab, 3, 3);
        printSquare(20, 20);
    }

    static void printArray(int[][] tab, int row, int columns) {

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < columns; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println(" ");
        }


    }


    /**
     * Wypisz na ekran choinkę :)
     * <p>
     * <p>
     * *
     * **
     * ****
     * ******
     * ********
     * **********
     * ************
     * **************
     * ****************
     * ******************
     * ********************
     * **********************
     * ************************
     * **************************
     * ****************************
     * ******************************
     * ********************************
     * **********************************
     * ************************************
     * **************************************
     */
    private static void printSquare(int height, int width) {

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width - i; j++) {
                System.out.print(" ");
            }

            for (int k = 2 * i ; k > 0 ; k--){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }


}
