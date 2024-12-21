#Application.java

class Circle
{
    double radius;
    
    void calculateArea() //method 1 definition
    {
        double area = 3.14*radius*radius;
        System.out.println("Area of circle: " +area);
    }
    void calculateCircumference() //method 2 definition
    {
        double circum = 2*3.14*radius;
        System.out.println("Circumference of circle: " +circum);
    }
}
class Main
{
    public static void main(String args[])
    {
        Circle c = new Circle(); //creating object of class circle
        c.radius = 5; 
        c.calculateArea(); //invokes calculateArea() with object c
        c.calculateCircumference(); //invokes calculateCircumference() with object c
    }
	#feature201 changes by Ethan Developer on Oct2024 in Reports Module
	public void display2(int a) {
    System.out.println("Method with a single parameter: " + a);
  }

  public static void main(String[] args) {
    
    // create an object of Main
    Main obj = new Main();

    // calling method with no parameter
    obj.display1();
    
    // calling method with the single parameter
    obj.display2(24);
  }
}
#end of feature201code

}