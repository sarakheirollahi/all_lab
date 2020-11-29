//import java.*;

import java.util.Date;

public class Vote {
   private Person person ;
    private String date;
    public Vote (Person p,String d){
        person=p;
        date=d;

    }

    public String getDate() {
        return date;
    }

    public Person getPerson() {
        return person;
    }
}
