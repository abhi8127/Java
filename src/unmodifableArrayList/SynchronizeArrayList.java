package unmodifableArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizeArrayList {
    public static void main(String[] args){
        List<String> list1= new ArrayList<>();
        list1.add("Element1");
        list1.add("Element2");

        List<String> list2= Collections.synchronizedList(new ArrayList<>());

        synchronized (list2){
            list2.addAll(list1);
        }

        System.out.println(list1);
        System.out.println(list2);
    }
}
