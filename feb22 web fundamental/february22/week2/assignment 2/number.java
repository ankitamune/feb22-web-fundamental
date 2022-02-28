import java.util.Scanner;
public class number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        while(n>0){
            System.out.println(n);
            n--;
        }
    }
}