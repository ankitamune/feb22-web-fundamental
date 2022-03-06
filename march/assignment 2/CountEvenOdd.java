import java.util.Scanner;
public class CountEvenOdd {
	public static void main(String[] args) 
	{
        int evenCount=0;
        int oddCount=0;
		Scanner sc=new   Scanner(System.in);
        int [] arr=new int[10];
        int n=arr.length;
        for(int i=0;i<10;i++){
            System.out.println("enter number ");
            arr[i]=sc.nextInt();
        }   

		for(int i = 0; i < n; i++)
		{
			if(arr[i] % 2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}		
		System.out.println("\n Total Number of Even Numbers in this Array = " + evenCount);
		System.out.println("\n Total Number of Odd  Numbers in this Array = " + oddCount);
	}
}