class bike{
    int bike_wheel;
    String bike_color;
    String bike_name;
    public bike(int wheel,String color,String name){
        bike_wheel=wheel;
        bike_color=color;
        bike_name=name;
        
    }
    
}
class car{
    int car_wheel;
    String car_color;
    String car_name;
    
    void car(int wheel,String color,String name){
        car_wheel=wheel;
        car_color=color;
        car_name=name;
        
    }
}
class truck{
    int truck_wheel;
    String truck_color;
    String truck_name;
    void truck(int wheel,String color,String name){
        truck_wheel=wheel;
        truck_color=color;
        truck_name=name;
        
    }
}   
   
class Main{
    public static void main(String args[])
    {
        bike b=new bike(2,"white","tvs");
        System.out.println(b.bike_wheel+" " +b.bike_color + " "+b.bike_name); 

       
    }  
}  