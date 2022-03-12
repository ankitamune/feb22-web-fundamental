public class lower {
    public static void main(String args[]){
        int [][]a= {{4,8,4},{5,6,9},{1,2,3}};
        
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a.length;j++){
                if(i>=j){
                    System.out.print(a[i][j]+" ");
                }
                
            }
            System.out.println( ); 
        }
        
    }
}
