/**
 * Created by abbyr on 22/10/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class SumAnalysis
{
   public static void main(String[] args){
      long startTime, endTime;

      System.out.printf("%20s %20s %20s %20s%n", "Num elements", "Algorithm A", "Algorithm B", "Algorithm C");
      System.out.printf("%20s %20s %20s %20s%n", SumIntegers.sumAExecutionTime(1), SumIntegers.sum_B(1), SumIntegers.sumCExecutionTime(1));


   }
}//class
