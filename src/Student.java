public class Student {
    private  String firstName;
    private  String lastName;
    private  String id;
    private int grade;

    public Student(String firstName, String lastName, String id ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        grade = 0;
    }



    public String getFirstname() {

        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public String getLastname() {

        return lastName;
    }

    public void setLastname(String lastName)
    {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public void print(){
        System.out.println( " Student ID: "+id+"\n"+firstName+lastName+"\n Grade: "+grade);
    }
}
