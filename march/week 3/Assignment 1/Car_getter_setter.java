public class Car_getter_setter {
    private String color;
    private String model;
    // Getter
    public String getColor() {
      return color;
    }
    
    // Setter
    public void setColor(String c) {
      this.color = c;
    }
    public String getmodel() {
        return model;
    }
      
      // Setter
    public void setmodel(String m) {
        this.model = m;
    }
    public static void main(String[] args) 
    {
        Car_getter_setter v1 = new Car_getter_setter();
        v1.setColor("Red");
        System.out.println(v1.getColor());
        v1.setmodel("xyz"); 
        System.out.println(v1.getmodel());
        
    }


}
  