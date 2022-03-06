import java.util.Scanner;
public class swap_method{
    public static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping" );
        System.out.println(a );
        System.out.println(b );


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number  ");
        int a=sc.nextInt();
        System.out.print("enter 1st number  ");
        int b=sc.nextInt();
        swap(a ,b);
        
    }
}