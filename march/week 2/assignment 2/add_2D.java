public class add_2D{
    public static void main(String args[]){
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
        int [][]b={{9,8,7},{8,6,4},{1,2,3}};
        int d[][]=new int[3][3];
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                d[i][j]=a[i][j]+b[i][j];
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        
        

    }
}