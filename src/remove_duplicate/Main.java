package remove_duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args){
        List<Integer> data= Arrays.asList(20,30,10,10,20,40,50);
        System.out.println(data);

        //REMOVING DUPLICATE AND PRINTING
        List<Integer> withoutDupli= data.stream().distinct().collect(Collectors.toList());
        System.out.println(withoutDupli);

        //SORTING
        withoutDupli.stream().sorted().forEach(System.out::println);

        //SORTED AND STORE
        List<Integer> sortedlist=withoutDupli.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist);

        //REVERSE SORTED
        List<Integer> reverseSortedList=withoutDupli.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
         System.out.println(reverseSortedList);
    }
}
