public class number2{
    public static void main(String args[]){
        int count=0;
        int i=1;
        do
        {

            int num=(i*(6*i));
            
            if(num%6==0)
            {
                System.out.println(num);
                count++;    
            }
            i++;
        
        }while(count<7);
    }
}