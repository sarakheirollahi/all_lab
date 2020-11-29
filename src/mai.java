public class mai {   public static void main(String[] args) {
    Student std1 = new Student("sara","kheriolahi","9731081");
    Student std2 = new Student("yeganeh","arabi","9731041");
    Student std3 = new Student("saed","shahi","9731099");
    Lab ap = new Lab(1,"tus");
    std1.print();
    std1.setGrade(22);
    std1.print();
    std2.print();
    std2.setGrade(45);
    std2.print();
    std3.print();
    ap.addstudent(std1);
    ap.addstudent(std2);
    ap.calculateAvg();
    ap.print();
    Teacher t1 = new Teacher("nazi");
    t1.add(ap);
    t1.print();
    Departeman d = new Departeman("amirkabir");
    d.add(t1);
    d.print(); }
}

