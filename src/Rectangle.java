import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Math.sqrt;

public class Rectangle{
    private ArrayList<Double>sides = new ArrayList<Double>();

    public Rectangle(double side1,double side2,double side3,double side4){
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side3);

    }
    public ArrayList<Double> getSides() {
        return sides;
    }

    public void setSides(ArrayList<Double> sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }


    public boolean isEqual(){
        if (sides.get(0) == sides.get(1) && sides.get(1)==sides.get(2) && sides.get(3)== sides.get(2)){
            return  true ;
        }
        return false;
    }
    public double calculateArea(){
        double s = 0;
        if(sides.get(0 )== sides.get(1)){
            s=sides.get(0)*sides.get(2);
        }else
            s=sides.get(0)*sides.get(1);
        return  s;
    }
    public  double calculatePerimeter(){

        double p1 =  (sides.get(0)+sides.get(1)+sides.get(2)+ sides.get(3));
        return p1;
    }
    public  void draw(){
        System.out.println("Rectangle"+calculateArea()+","+calculatePerimeter());
    }
}

