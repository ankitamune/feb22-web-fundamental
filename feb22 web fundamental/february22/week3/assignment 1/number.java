
public class number{
    public static void main(String args[]){
        int count=0;
        int i=1;
        do
        {

            int num=4*i+9;
            /*System.out.println("i ::"+i);*/
            if(num%3==0)
            {
                System.out.println(num);
                count++;    
            }
            i++;
        
        }while(count<3);
    }
}