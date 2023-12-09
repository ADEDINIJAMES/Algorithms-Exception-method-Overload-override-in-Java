//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class ExceptiOn {
//    public static void main(String[] args) {
//        try {
//            int result = ExceptIon.divide(10, 0);
//            System.out.println("Result: " + result);
//        } catch (ArithmeticException e) {
//            System.err.println("An error occurred: " + e.getMessage());
//        }
//
//    public static int divide(int dividend, int divisor) {
//        if (divisor == 0) {
//            throw new ArithmeticException("Division by zero is not allowed.");
//        }
//        return dividend / divisor;
//    }
//
//}
// class TR {
//     public static void main(String[] args) {
//         try (
//                 FileInputStream fis = new FileInputStream("example.txt");) {
//             // Use the file input stream
//         } catch (IOException e) {
//             // Handle the exception
//         }
//         finally {
//             System.out.println("retype");
//         }
//     }
// }
//}
//
