package pl.sda.algorithm.solutions;


public class MultidimensionalArraysSolutions {


    public static void main(String[] args) {

        int tab[][] = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 8, 9}
        };
        printArray(tab, 3, 3);
        printChrismasTree(20, 20);

    }


    /**
     * TODO Wypisz wszystkie elementy listy na ekran
     *
     * @param tab
     * @param row
     * @param columns
     */
    static void printArray(int[][] tab, int row, int columns) {

    }


    /**
     * TODO Wypisz na ekran
     * <p>
     *
     */
    private static void printChrismasTree(int height, int width) {


        for (int i = 0; i < height; i++) {

            for (int j = (width - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i; k > 0; k--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }


    }


}
