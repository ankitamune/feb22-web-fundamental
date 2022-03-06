
public class sum_array  
{  
    static int arr[]={10,20,30,40}; 
    static int sum()
    {  
    int n=arr.length;
    int sum=0 ;
    for(int i=0;i<n;i++)
    {
        sum=sum+arr[i];
    } 
    return sum;  
    }  
    public static void main(String args[])  
    {  
       System.out.println(sum()); 
    }  
    
}  