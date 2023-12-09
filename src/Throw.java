import java.util.Scanner;

public class Throw {// throw is ued to create custom exceptions; use throw new
    public void checkAge(int age){

            if (age < 18) {
                throw new ArithmeticException("Access denied; you must be at least 18 years old ");
            } else {
                System.out.println(" Access granted ");
            }
        }


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How old are you");
       int my_Age = scanner.nextInt();
       Throw t = new Throw();
       t.checkAge(my_Age);




    }
}
