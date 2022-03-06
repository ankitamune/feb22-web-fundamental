import java.util.Scanner;
public class factor 
{
    public static void main(String[] args) {
        Scanner sc=new   Scanner(System.in);
        int [] arr=new int[3];
        int d=arr.length;
        for(int i=0;i<3;i++){
            System.out.println("enter number ");
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i < d; i++) {
            arr[i]=arr[i]*d;
            System.out.println("the factor  "  +arr[i]);
            
        }

    }
}
