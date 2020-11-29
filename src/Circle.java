import java.util.Objects;

public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius ;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea(){

        double area = (radius  * radius) * 3.14 ;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter = 2*radius*3.14;
        return perimeter;
    }
    public void draw(){
        System.out.println("circle" +calculatePerimeter()+","+calculateArea());

    }



}