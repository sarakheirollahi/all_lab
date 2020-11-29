import java.util.ArrayList;

public class BImar {
     String name;
     String Bime;
     String job;
     String Loc;
     String Date;
     ArrayList<String> DocterAccesAll;
     ArrayList<String> DocterSpecific;
     Sabeghe Sabeghe =new Sabeghe();

     public void AddDocter(String name){};
     public void RemoveDocter(String neme){};
     public void AddDocterSpecific(String name){};
     public void RemoveDocterSpecific(String neme){};

    public String getBime() {
        return Bime;
    }

    public ArrayList<String> getDocterSpecific() {
        return DocterSpecific;
    }
    public ArrayList<String> getDocterAccesAll() {
        return DocterAccesAll;
    }


    public String getDate() {
        return Date;
    }

    public String getJob() {
        return job;
    }

    public String getLoc() {
        return Loc;
    }

    public String getName() {
        return name;
    }

    public Sabeghe getSabeghforDocter() {
        return Sabeghe;
    }

    public void setBime(String bime) {
        Bime = bime;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setDocterSpecific(ArrayList<String> DOCTOR) {
        this.DocterSpecific = DOCTOR;
    }
    public void setDocterAccesAll(ArrayList<String> DOCTOR) {
        this.DocterAccesAll = DOCTOR;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSabeghebyDocter(Sabeghe sabeghe) {

    }
}
