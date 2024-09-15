package number_game;

import java.util.Scanner;

public class TrainSeat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the seat number");
        int seat_no=sc.nextInt();
        if(seat_no % 8==0)
        {
            System.out.println("Side upper");
        }
        else if(seat_no % 8==1||seat_no%8==4)
        {
            System.out.println("Lower");
        }
        else if(seat_no % 8==2||seat_no%8==5)
        {
            System.out.println("Middle");
        }
        else if(seat_no % 8==3||seat_no%8==6)
        {
            System.out.println("Upper");
        }
        else if(seat_no % 8==7)
        {
            System.out.println("Side Lower");
        }
    }
}
