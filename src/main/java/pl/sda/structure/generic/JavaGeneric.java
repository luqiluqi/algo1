package pl.sda.structure.generic;

import java.util.ArrayList;
import java.util.List;

public class JavaGeneric {

    public static void main(String args[]){

        List<String> list = new ArrayList<>();

        list.add("test1");;
        list.add("test2");


        for(Object element : list){
            String string = (String)element;
            System.out.println(string);
        }


    }

}
