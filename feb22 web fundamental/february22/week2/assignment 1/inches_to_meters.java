import java.util.Scanner;
public class inches_to_meters{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the inches ");
        double Inches = sc.nextDouble();
        double meter = Inches*0.0508;
        System.out.println("the meter is" +meter);


    }
}