public class Overload { //Overloading - wher two or more methods have the same name but different values and implementation
    public void volume(int x, int increment){
       int y = x + increment;
        System.out.println("The new value of the volume is "+ y);










    }
public void volume ( int x){
    System.out.println("the current volume is :"+ x);

}
public void volume(){
    System.out.println("leave the volume");
}

    public static void main(String[] args) {
        Overload overload =new Overload();
        int x= 25;

        overload.volume();
        overload.volume(x);
        overload.volume(x,15);

    }
}
