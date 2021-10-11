import java.util.*;

public class first{

    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);
        int points = scn.nextInt();

        if(points>=30 && points <=50){
            System.out.println("Average");
        }
        else if(points>=51 && points <=60){
            System.out.println("Good");
        }
        else if(points>=61 && points <=80){
            System.out.println("Excellent");

        }
        else if(points>=81 && points <=100){
            System.out.println("Outstanding");

        }else{

        }



    }
}