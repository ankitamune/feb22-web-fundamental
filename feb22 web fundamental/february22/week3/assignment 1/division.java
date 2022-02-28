import java.util.Scanner;
public class division {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(((n%2)==0) || ((n%8)==0))
        {
            if((n%12)!=0){
                System.out.println("number is divisible 2,8 but not 12");
            }
            else{
                System.out.println("number is not  divisible 2,8 but not 12");
            }
        }
    }
}
