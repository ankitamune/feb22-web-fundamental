import java.util.Scanner;
public class division
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        if(n%3==0)
        {
            System.out.println("divisible by 3 ");
        }
        else
        {
            System.out.println("not divisible by 3 ");
        }
                
    }       
        
}
