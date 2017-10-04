import java.util.Scanner;

public class Pe7
{
   public static void main(String[] args)
   {
     
   int i;
   for( i=1;i<=12;i++)
    System.out.println("the factorial 0f"+  i+ "is"+factorial(i));

    System.out.println("the factorial of 13 is out of range");
   }


  public static int factorial(int k)
  {
   int j;
   int f=1;
   for(j=1;j<=k;j++)
     f=f*j;
   
    return f;
  }
}
  

