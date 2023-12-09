class User {
public String complexion;
public String height;
public String name;
public String size;
public String gender;
public void print(){
    System.out.println("Hi, I am Jumbo. Your School Management Software Robot");

}
public void  regards(){
    System.out.println("Please be good. have a nice day !!");

}

}
class Student extends User{
  public String assignment;
  public String level;

  public void print(){



      super.print();// "super" used to invoke immediate parent class method

      System.out.println("Student:  "+super. name+ ",  "+ super.gender+ ",  has "+ " " +"this"+ "   "+ assignment+ "   to do");
  }// Using 'super' to refer to immediate parent class instance variable.

    public Student(String assignment, String level, String name, String gender) {
        this.assignment = assignment;
        this.level = level;
        this.name= name;
        this.gender =gender;
    }
}

public class SuperKey {
    public static void main(String[] args) {
        Student student = new Student("School Management Software ","Jss 3", "Adebayo Tijani", "Female");
         student.print();
         student.regards();
    }
}

