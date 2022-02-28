import java.util.Scanner;
public class inveted_v
{
    public static void main(String[] args)  
    {  
        int s=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        
        int n = scan.nextInt();
        for(int i = n-1; i>= 0; i--)
        {
            for(int j= n-1;j>s;j--)
            
                System.out.print(" ");
            System.out.print("*");
            for(int k=1;k<(s*2);k++)
            
                System.out.print(" ");
            if(i<n-1)
            
                System.out.print("*");
            s++;
            System.out.println();
        }
    }
}
