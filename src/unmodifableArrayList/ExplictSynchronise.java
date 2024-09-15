package unmodifableArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExplictSynchronise {
    public static void main(String[] args){
        List<String> list1=new ArrayList<>();
        list1.add("Demo1");
        list1.add("Demo2");
        list1.add("Demo3");

        List<String> list2=new ArrayList<>();
        synchronized (list2){
            list2.addAll(list1);
        }
        System.out.println(list2);
        System.out.println(list1);

    }
}
