public class Finally{
    
    public static void main(String args[]){
        try {
            System.out.println("Inside the try block"); 
            int x=20,y=0;    
            System.out.println(x/y);    
        }
        catch(ArithmeticException e){  
            System.out.println(e.getMessage());  
        }
        finally {  
            System.out.println("finally block is always executed");  
        }
        System.out.println("rest of the code...");    
    }    
}    