class B{
    void kick(B obj) {
        System.out.println("method  is invoked ");
    }


void p(){
        kick(this);// the keyword "this can be used to pass an argument"
}
    }




public class Thiss {
    public static void main(String[] args) {
        B b= new B();
        b.p();

    }

}
