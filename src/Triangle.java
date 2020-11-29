import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Math.sqrt;

public class Triangle {

    private ArrayList<Double>sides = new ArrayList<Double>();

    public  Triangle(double side1,double side2,double side3){
        sides.add(side1);
        sides.add(side2);
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
        return "Triangle{" +
                "sides=" + sides +
                '}';

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);
    }
    public boolean isEqual(){
        if (sides.get(0) == sides.get(1) && sides.get(1)==sides.get(2)){
            return  true ;
        }
        return false;
    }
    public double calculateArea(){
        double p = calculatePerimeter()/2;
        double s=sqrt(p*(p-sides.get(0))*(p-sides.get(1))*(p-sides.get(2)));
        return  s;
    }
    public  double calculatePerimeter(){

        double p1 =  (sides.get(0)+sides.get(1)+sides.get(2));
        return p1;
    }
    public  void draw(){
        System.out.println("triangle"+calculateArea()+","+calculatePerimeter());
    }
}
