import java.util.ArrayList;
import java.util.Iterator;

public class Teacher {

    private String name;
    private ArrayList<Lab> Labs;

    public Teacher(String name){
        this.name = name;
        Labs = new ArrayList<Lab>();
    }

    public ArrayList<Lab> getMyLab() {
        return Labs;
    }

    public void setMyLabs(ArrayList<Lab> myLabs) {
        this.Labs = myLabs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Lab newlab){

        boolean f=false;
        if (Labs.isEmpty())
            Labs.add(newlab);
       else {
            for(Lab lab : Labs){
                String d = lab.getDay();
                String n = newlab.getDay();
                if(n==d)
                    f=true;}

                if(!f) {
                    System.out.println("hi");
                    Labs.add(newlab);
                }
                else{ System.out.println("cannot add");
                }
            }
        }

    public void remove(Lab l ){
        Iterator<Lab> iterator = Labs.iterator();
        while (iterator.hasNext()) {
            Lab lab = iterator.next();
            String name =lab.getDay();
            String n =l.getDay();
            if(name==n)
                iterator.remove();
        }}

    public void  print(){

        for(Lab lab : Labs){
            System.out.println(name +","+lab.getDay());
        }


    }
}

