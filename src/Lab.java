public class Lab {

    private int capacity;
    private int avg;
    private String day;
    private Student [] students;
    private int currentSize;

    public Lab(int capacity,String day){
        this.capacity = capacity;
        this.day = day;
        this.students = new Student[capacity];
    }


    public void addstudent(Student std){
        if(currentSize<capacity){
            students[currentSize] = std;
            currentSize++;}
        else
            System.out.println("LAb is full!");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }



    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getAvg() {
        return avg;
    }

    public void calculateAvg(){
        int i = 0;
        int av=0;
        for(i=0 ; i<currentSize ; i++){
            av +=students[i].getGrade();
        }
        avg = av/currentSize;

    }

    public void print(){
        for(Student ex :students){
            System.out.println("std fname: "+ex.getFirstname()+
                              "\n std id: "+ex.getId()+"\n std Grade: "+ex.getGrade());
        }
        System.out.println("lab avg : "+avg);
    }
}
