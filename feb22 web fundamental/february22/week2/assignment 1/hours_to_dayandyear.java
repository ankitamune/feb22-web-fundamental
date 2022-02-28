import java.util.Scanner;
public class hours_to_dayandyear{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the hours ");
        int hours = sc.nextInt();
        double day =  hours * 0.0416667;
        System.out.println("the day is " +day);
        double year =  hours * 0.000114155 ;
        System.out.println("the year is " +year);


    }
}