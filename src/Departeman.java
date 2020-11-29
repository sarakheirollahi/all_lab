import java.util.ArrayList;
import java.util.Iterator;

public class Departeman {
    private String name;
    private ArrayList<Teacher> teachers;

    public Departeman(String name) {
        this.name = name;
        teachers = new ArrayList<>();
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void add(Teacher l){
       boolean f=false;
        if(teachers.isEmpty()){
            teachers.add(l);
        }
        else {

            for(Teacher t : teachers){
                String n = t.getName();
                String m = l.getName();
                if(m==n){
                    f=true;
            }}
            if(f)
                System.out.println("cannot add");
            else
                teachers.add(l);}
    }
    public void remove(Teacher l ){
        Iterator<Teacher> iterator = teachers.iterator();
        while (iterator.hasNext()) {
            Teacher t = iterator.next();
            String name =t.getName();
            String n =l.getName();
            if(name==n)
                iterator.remove();
        }}
    public void print(){
        for(Teacher t : teachers){
            System.out.println(name+" ,"+t.getName());
            System.out.println();
        }
    }




}