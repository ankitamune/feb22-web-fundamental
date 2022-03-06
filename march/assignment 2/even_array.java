import java.util.Scanner;
public class even_array {
    public static void main(String args[]){
        Scanner sc=new   Scanner(System.in);
        int [] arr=new int[10];
        int n=arr.length;
        for(int i=0;i<10;i++){
            System.out.println("enter number ");
            arr[i]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0){
                System.out.println("the event number is "+arr[i]);
            } 
            
        }
        
    }
    
}
