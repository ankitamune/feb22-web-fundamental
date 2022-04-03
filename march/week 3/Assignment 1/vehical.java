public class vehical {
  int modelYear;
  String modelName;
  String modelcolor;

  public vehical(int year, String name,String color) {
    modelYear = year;
    modelName = name;
    modelcolor=color;
  }

  public static void main(String[] args) {
    vehical c = new vehical(1969, "Mustang","black");
    System.out.println(c.modelYear + " " + c.modelName + " " +c.modelcolor);
  }
}
