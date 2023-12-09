import java.util.Scanner;

public class TryCatch1 {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6};
        try{
            System.out.println(number[7]);


        } catch (Exception e){
            System.out.println("the lenght is less than 7,  Try again later!!");
        }
    }
}

class Trycatch2{


    public static void main(String[] args) {
        int[] my_numbers ={1,2,3,4,5,6};
        Scanner scanner= new Scanner(System.in);
        System.out.println("state thr index");
        int x = scanner.nextInt();;
        try {
            System.out.println(my_numbers[x]);
        }catch (Exception e){
            System.out.println("out of bounds!!!");// THIS PRINTED IF AN ERROR IS DISCOVERED
        }finally {
            System.out.println("TRY AGAIN LATER");// THIS IS PRINTED AFTER CATCH HAS BEEN EXECUTED
        }
    }


}