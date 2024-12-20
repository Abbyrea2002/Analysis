/**
 * Created by abbyr on 22/10/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class SumIntegers
{
   public static long sum_A(int n){
      long sum = 0;
      for(int i = 1; i<= n; i++){
         sum = sum + i;
      }
       return sum;
   }

   public static long sum_B(int n){
      long sum = 0;
      for(int i = 1; i <= n; i++){
         for(int j = 1; j <= i; j++){
            sum = sum + 1;
         }
      }
      return sum;
   }

   public static long sum_C(int n){
      long sum = 0;
      sum = n * (n + 1) / 2;
      return sum;
   }


   public static long measureExecutionTime(Runnable algorithm){
      long startTime, endTime;
      startTime = System.nanoTime();
      algorithm.run();
      endTime = System.nanoTime();
      return(endTime - startTime);
   }

   public static void main(String[] args){
      long startTime, endTime;

      startTime = System.nanoTime();
      System.out.println(sum_A(10000));
      endTime = System.nanoTime();
      System.out.println("Algorithm A: " +(endTime - startTime) + "ns\n");

      startTime = System.nanoTime();
      System.out.println(sum_B(10000));
      endTime = System.nanoTime();
      System.out.println("Algorithm B: " +(endTime - startTime) + "ns\n");

      startTime = System.nanoTime();
      System.out.println(sum_C(10000));
      endTime = System.nanoTime();
      System.out.println("Algorithm C: " +(endTime - startTime) + "ns\n");


   }
}//class
