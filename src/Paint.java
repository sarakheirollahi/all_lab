import java.util.ArrayList;

public class Paint {
    private ArrayList<Circle> circles = new ArrayList<Circle>();
    private ArrayList<Triangle> triangles = new ArrayList<Triangle>();
    private ArrayList<Rectangle>rectangles = new ArrayList<Rectangle>();
    public  void addCircle(Circle c1){
        circles.add(c1);
    }
    public  void addTriangle(Triangle t1){
        triangles.add(t1);
    }
    public  void addRectangle (Rectangle r1){
        rectangles.add(r1);
    }
    public void drawAll(){
        for(Circle c1 : circles){
            c1.draw();}
        for(Triangle t1 : triangles){
            t1.draw();}
        for(Rectangle r1 : rectangles)
            r1.draw();
    }
    public void printAll(){
        for(Circle c1 : circles){
            System.out.println(c1.toString());}
        for(Triangle t1 : triangles){
            System.out.println(  t1.toString());}
        for(Rectangle r1 : rectangles)
            System.out.println(r1.toString());
    }    }

