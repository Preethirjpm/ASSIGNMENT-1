public class SwapElements {
 
  public static void main(String[] args) {
         
          int a = 101;
          int b = 201;
         
          System.out.println("Before Swapping");
          System.out.println("Value of a is :" + a);
          System.out.println("Value of b is :" + b);
         
          //add both the numbers and assign it to first
          a = a + b;
          b = a - b;
          a = a - b;
         
          System.out.println("After Swapping");
          System.out.println("Value of a is :" + a);
          System.out.println("Value of b is :" + b);
  }

}