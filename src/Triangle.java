import java.util.Objects;

import static java.lang.Math.sqrt;

public class Triangle extends Polygan {
    public Triangle (double side1,double side2,double side3){
        super(side1, side2, side3);

    }
    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + getSides() +
                '}';

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(getSides(), triangle.getSides());
    }
    public boolean isEqual(){
        if (getSides().get(0) == getSides().get(1) && getSides().get(1)==getSides().get(2)){
            return  true ;
        }
        return false;
    }
    @Override
    public double calculateArea(){
        double p = calculatePerimeter()/2;
        double s=sqrt(p*(p-getSides().get(0))*(p-getSides().get(1))*(p-getSides().get(2)));
        return  s;
    }
    @Override
    public  double calculatePerimeter(){

        double p1 =  (getSides().get(0)+getSides().get(1)+getSides().get(2));
        return p1;
    }
    @Override
    public  void draw(){
        System.out.println("triangle"+calculateArea()+","+calculatePerimeter());
    }
}
