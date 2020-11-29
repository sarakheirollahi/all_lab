public class Person {
    private String  FirstName;
    private String  LastName;
  public Person(String firstName,String lastName){
      FirstName=firstName;
      LastName=lastName;
  }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
