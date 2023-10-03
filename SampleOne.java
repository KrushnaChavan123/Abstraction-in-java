//Create incomplete and complete method in abstract class 


abstract class SampleTwo
{
 abstract void m1();
  void m2()
  {
   System.out.println("Inside m2 method");
  }
}
class SampleOne extends SampleTwo
{
 void m1()
 {
  System.out.println("Inside m1 method");
 }
 void m2()
 {
	  System.out.println("Inside m2 method - child");
 }
}
class Sample
{
 public static void main(String[]args)
 {
  SampleTwo s1=new SampleOne();
  s1.m1();
  s1.m2();
  }
 }