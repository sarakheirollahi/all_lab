import java.util.Objects;

public class Rectangle extends Polygan {
    public Rectangle (double side1,double side2,double side3,double side4){
        super(side1, side2,side3,side4);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + getSides() +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals( getSides() , rectangle. getSides() );
    }


    public boolean isEqual(){
        if ( getSides() .get(0) ==  getSides() .get(1) &&  getSides() .get(1)== getSides() .get(2) &&  getSides() .get(3)==  getSides() .get(2)){
            return  true ;
        }
        return false;
    }
    @Override
    public double calculateArea(){
        double s = 0;
        if( getSides() .get(0)==  getSides() .get(1)){
            s= getSides() .get(0)* getSides() .get(2);
        }else
            s= getSides() .get(0)* getSides() .get(1);
        return  s;
    }
    @Override
    public  double calculatePerimeter(){

        double p1 =  ( getSides() .get(0)+ getSides() .get(1)+ getSides() .get(2)+  getSides() .get(3));
        return p1;
    }
    public  void draw(){
        System.out.println("Rectangle"+calculateArea()+","+calculatePerimeter());
    }
}


