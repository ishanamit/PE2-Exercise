import java.util.Scanner;


public class Pe2
{
  public static void main(String[] args)
  {
   Scanner inp=new Scanner(System.in);
   int d;
   d=inp.nextInt();
   if(checkpowerOf4(d))
    System.out.println("the number"+d+"is power of 4");
   else
    System.out.println("the number is not a power of 4");
  }

  public static boolean checkpowerOf4(int n)
{
  if(n == 0)
    return false;
  while(n != 1)
  {    
   if(n%4 != 0)
      return false;
    n = n/4;      
  }
  return true;
}
}
