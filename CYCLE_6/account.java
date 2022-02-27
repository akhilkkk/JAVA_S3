import java.util.*;
class account
{
 static void checkbalance(int x)
 {
  if(x<500)
  {
   throw new ArithmeticException ("Balance is not sufficient");
  }
  else
  {
   System.out.println("You can proceed");
  }
 }
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter account balance:");
  int b = obj.nextInt();
  checkbalance(b);
 }
}
