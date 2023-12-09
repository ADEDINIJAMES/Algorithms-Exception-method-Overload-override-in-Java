public class Str {
     public static void stringConcat(String var) {
          var= var+ "Edureka";

     }

     public static void stringBufferConcat(StringBuffer str) {
          str = str.append("Edureka");
     }
     public static void stringBuilderConcat(StringBuilder var) {
          var = var.append("Edureka");


     }

     public static void main ( String[] args ){
          String var = new String("Hello");
          stringConcat(var);;
          System.out.println(" the final value is " + " " +var);

          StringBuffer str = new StringBuffer("Hello");
          stringBufferConcat(str);
          System.out.println(" the final value is "+ " "+ str);

          StringBuilder var1 =  new StringBuilder("Hello");
          stringBuilderConcat(var1);
          System.out.println("the final value is"+ var1);


     }
}

