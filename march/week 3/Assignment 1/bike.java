class bike {
    
    String model;
    String color;
    int wheel;
  
    //bike constructor
    public bike(){
        model = "ktm";
        color = "pink";
        wheel = 2;
    }
    public static void main(String args[]) {
        bike b = new bike();
        System.out.println(b.model);
        System.out.println(b.color);
        System.out.println(b.wheel);
        
    }
}
