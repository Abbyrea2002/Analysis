/**
 * Created by abbyr on 22/10/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class SumAnalysis
{
   public static void main(String[] args){
      long startTime, endTime;

      System.out.printf("%20s %20s %20s %20s%n", "Num elements", "Algorithm A", "Algorithm B", "Algorithm C");
      startTime = System.nanoTime();
      SumIntegers.sum_A(1);
      endTime = System.nanoTime();
      System.out.printf("%20s %20s %20s %20s%n", 1, (endTime - startTime));


   }
}//class
