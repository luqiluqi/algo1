package pl.sda.algorithm.search;

public class MDLinearSearch {

    public int linearSearch(int item, int[] array) {
        for(int i = 0 ; i < array.length; i++){
            if(array[i] == item){
                return i;
            }
        }
        return -1;
    }

}
