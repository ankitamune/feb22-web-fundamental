public class reverse{
    public static int reverse(int n){
        int digit;
        
        int rev=0;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
            
        }
        
        return rev;
    }
    public static void main(String args[]){
        int rev;
        rev=reverse(564);
        System.out.println(rev);
    }
}