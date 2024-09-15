package number_game;

import java.util.Scanner;

public class Nearest_Round {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the no");
        num= sc.nextInt();
        System.out.println(((num+9)/10)*10);
    }
}
