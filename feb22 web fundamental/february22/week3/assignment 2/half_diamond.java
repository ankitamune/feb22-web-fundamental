public class half_diamond {
    public static void main(String args[]){
        int n=11;
        int st=1;
        int space=1;
        int count=1;
        for( int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("");
            }
            for(int j=1;j<=st;j++){
                System.out.print("* ");
            }
            if(i<=n/2){
                space--;
                st=st+1;
            }
            else{
                space++;
                st=st-1;
            }
            System.out.println();
            

        }

    }
    
    
}
