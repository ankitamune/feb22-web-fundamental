import java.util.Scanner;
class pants_style_star
{
    public static void main(String[] args)  
    {  
        Scanner scan = new Scanner(System.in);
        System.out.print("Rows : ");
        int n = scan.nextInt();
        for(int i= 0; i<n; i++)
        {
            for(int j= n ; j>i; j--)
                System.out.print("* ");
            for(int k = 1; k<=4*i;k++)
                System.out.print(" ");
            for(int k = i+1 ; k<=n; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}