import java.util.Scanner;
public class power{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n%2==0)
        {
            n=n/2;
        }
        if(n==1){
            System.out.println("number is power of two");
        }
        else{
            System.out.println("number is not power of two");
        }
    }
        
}