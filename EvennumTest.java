import java.util.Scanner;
 
public class EvennumTest
{
 public static void main(String[] args)
{
   Scanner inp=new Scanner(System.in);
   int d;
   d=inp.nextInt();
  if(isEven(d))
    System.out.println("the number is even");
  else
   System.out.println("the number is not even");
}
  
public static boolean isEven(int number)
{
  if(number%2==0)
   return true;
  else 
   return false;
}
}

