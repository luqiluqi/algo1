package pl.sda.structure.table;

public class TableTask1 {

    public static void main(String args[]) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;


        for (int i = 0; i < array.length; i+=2) {
            array[i] = array[i] + array[i - 1];
//            if (i % 2 == 1) {
//                array[i] = array[i] + array[i - 1];
//            }
        }

        for (int i = 0; i < array.length; i++) {

            if(array[i] % 2 == 0){
                array[i]= array[i] / 2;
            }
            sum = array[i] + sum;

        }

        assert sum == 55;
        System.out.println(sum);
    }

}