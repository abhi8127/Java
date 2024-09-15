package unmodifableArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableArrayList {
    public static void main(String... args) {
        List<String> orignalList = new ArrayList<>();
        orignalList.add("Demo1");
        orignalList.add("Demo2");

        List<String> unmodifable = Collections.unmodifiableList(orignalList);

        try {
            unmodifable.add("Demo3");
        } catch (Exception e) {

            System.out.println(e);


        }
        System.out.println(orignalList);
        System.out.println(unmodifable);

    }
}