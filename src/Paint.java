import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape s1){shapes.add(s1);}
    public void printAll() {
        for (Shape s1 : shapes) {
            System.out.println(s1.toString());
        }
    }
    public void drawAll(){
        for(Shape s1 : shapes){
            s1.draw();}}
}