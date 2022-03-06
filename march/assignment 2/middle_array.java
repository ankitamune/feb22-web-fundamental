import java.util.Scanner;
public class middle_array {
    public static void main(String arg[])	
	{
        Scanner sc=new   Scanner(System.in);
        int [] arr=new int[10];
        int n=arr.length;
        for(int i=0;i<10;i++){
            System.out.println("enter number ");
            arr[i]=sc.nextInt();
        }
        int startIndex = 0, lastIndex = arr.length - 1;
        int midIndex = startIndex + (lastIndex-startIndex)/2;
        System.out.println("The mid index is "+midIndex+" and the element at mid is "+arr[midIndex]);
    }
}
    
    

