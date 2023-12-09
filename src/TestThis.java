class Student1{
    int rollno;
    String name;
    float fee;
    Student1(int rollno,String name,float fee){
     //   this(10, "Dayo",2000.000F);// can be used invoke a constructor

        this.rollno=rollno;// not putting this will lead to null variable or zero
        this.name=name; // not putting this will lead to null variable or zero
        this.fee=fee;// not putting this will lead to null variable or zero from ambiguity
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}

    void print(){
        this.display();
        System.out.println("Ok Print");

    }
}
class TestThis{
    public static void main(String args[]){

        Student1 s1=new Student1(111,"ankit",5000f);

        Student1 s2=new Student1(112,"sumit",6000f);
        s1.display();
        s2.display();
        s1.print();
    }}
