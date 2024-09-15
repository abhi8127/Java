package practice2;

import java.util.ArrayList;

public class Autobxing {
    public static void main(String[] arg){
        char ch='a';
        Character c=ch;

        System.out.println(ch);

        System.out.println(c);

        ArrayList<Integer> alist=new ArrayList<>();
         alist.add(24);
         alist.add(25);
         System.out.println(alist.get(0));
         System.out.println(alist.get(1));

         System.out.println(alist);

         int num1= alist.get(0);

         System.out.println(num1);
    }
}
