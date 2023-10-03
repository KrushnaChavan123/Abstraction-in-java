//can one class abstract extends from another abstract class

abstract class check2
{
 abstract void m1();
}
 abstract class check1 extends check2
{
  abstract void m1();
 /*{
	  System.out.println("Inside m1 method");
 }
*/
}
class check
{
 public static void main(String[]args)
 {
  check2 c2=new check1();
  c2.m1();
  }
  
}