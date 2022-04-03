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
   
class arg{
    public static void main(String args[])
    {
        car c=new car(4,"white","tvs");
        System.out.println(c.car_name+" " +c.car_color + " "+c.car_name); 
        truck t=new truck(6,"red","abc");
        System.out.println(t.truck_color);

       
    }  
}  