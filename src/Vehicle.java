public class Vehicle {
    private int wheels;
    private String modeel;

    public void Start() {

    }

    public void stop() {


    }

    public void honk() {
        System.out.println("move faster");
    }
}
    class Car extends Vehicle {
        @Override
        public void honk() {
            System.out.println("Sola you are making a hell of noise");
        }
    }

 class Print {  
         public static void main(String[] args) {
             Vehicle vehicle = new Vehicle();
             vehicle.honk();
             Vehicle my_car= new Car();
             my_car.honk();
             Overload overload = new Overload();
            overload.volume(20,15);
         }
     }




