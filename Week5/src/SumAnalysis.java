/**
 * Created by abbyr on 22/10/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class SumAnalysis
{
   public static void main(String[] args){
      //displays headings
      System.out.printf("%20s %20s %20s %20s%n", "Num elements", "Algorithm A", "Algorithm B", "Algorithm C");
      //array of values to test for n
      int[] testValues = {1, 10, 100, 1000, 10000, 100000, 1000000};
      //for loop iterates over the body of code for each test value
      for(int n : testValues){
         //defines the algorithms as Runnable for each value of n
         Runnable algorithmA = () -> SumIntegers.sum_A(n);
         Runnable algorithmB = () -> SumIntegers.sum_B(n);
         Runnable algorithmC = () -> SumIntegers.sum_C(n);
         //sets measured execution time of each algorithm to the variables
         long timeA = SumIntegers.measureExecutionTime(algorithmA);
         long timeB = SumIntegers.measureExecutionTime(algorithmB);
         long timeC = SumIntegers.measureExecutionTime(algorithmC);
         //prints num of elements + each execution time for each test value
         System.out.printf("%20s %20s %20s %20s%n", n, timeA, timeB, timeC);

      }








   }
}//class
