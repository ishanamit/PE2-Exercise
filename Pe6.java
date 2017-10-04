import java.util.Scanner;
import java.util.Arrays; 
   
public class Pe6
{
 public static void main(String[] args)
 {
   Scanner inp=new Scanner(System.in);
   System.out.println("Enter the number of students");
   int a=inp.nextInt();
   int b[]=new int[a];
   int i,sum=0;
   double avg;

  for(i=0;i<a;i++)
  {
   System.out.println("Enter the grade for student"+(i+1));
   b[i]=inp.nextInt();
   sum=sum+b[i];
  }
 
avg=sum/a;
Arrays.sort(b);
System.out.println("the average is"+avg);
System.out.println("the lowest grade is"+b[0]);
System.out.println("the highest grade is"+b[a-1]);
}
}
   


