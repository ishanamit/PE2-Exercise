import java.util.Scanner;

public class Pe8
{
   public static void main(String[] args)
   {
     
   int i;
   for( i=1;i<=20;i++)
    System.out.println("the factorial 0f"+ ""+  i+ "is"+""+longfactorial(i));

    System.out.println("the factorial of 21 is out of range");
   }


  public static long longfactorial(int k)
  {
   int j;
   int f=1;
   for(j=1;j<=k;j++)
     f=f*j;
   
    return f;
  }
}
  
