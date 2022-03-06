import java.util.Scanner;
public class sum_array
{
    public static void main(String args[]){
        Scanner sc=new   Scanner(System.in);
        int [] arr=new int[10];
        int n=arr.length;
        for(int i=0;i<10;i++){
            System.out.println("enter number ");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            
            sum=sum+arr[i];
            
        }
        System.out.print("the sum of array is "+sum);
    }
}