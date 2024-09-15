package number_game;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        System.out.println("Enter the second number");
        int b=sc.nextInt();

        //without third variable

        /* a=a+b;
         b=a-b;
         a=a-b; */

       /* a=a*b;
        b=a/b;
        a=a/b;  */

        // with third variable

     /*   int c;
        c=a;
        a=b;
        b=c; */

        a=a^b;
        

         System.out.println("a :"+ a );
         System.out.println("b :"+ b);


    }
}
