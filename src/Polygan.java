import java.util.ArrayList;

public class Polygan extends Shape{
    private ArrayList<Double>sides = new ArrayList<Double>();
    public Polygan(double... args){
        for( double a : args)
            sides.add(a);
    }
    @Override
    public String toString(){
        String s =  sides.toString(); ;
        return  s;
    }
    public ArrayList<Double> getSides() {
        return sides;
    }

}
