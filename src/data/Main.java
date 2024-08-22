package data;

import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
          // System.out.println(i);
          for(int j=a;j>=i;j--)
          {
              System.out.print(j+" ");
          }
          System.out.println();
        }
    }
}
