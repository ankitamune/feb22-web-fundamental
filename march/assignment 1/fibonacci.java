public class fibonacci {
   public static int fibo(int n) {
       
       int f1=0;
       int f2=1;
       int f=0;
       System.out.print(f1+" "+f2);
    
       for(int i=2;i<n;i++){
        f=f1+f2;
        System.out.print(" "+f); 
        f1=f2;
        f2=f;
       }
       return f;
   }
   public static void main(String args[]){
    int n;
    n=fibo(10);
    System.out.println(" "+ +n + " ");
}
}
