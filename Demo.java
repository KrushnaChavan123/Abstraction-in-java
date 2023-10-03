//Abstraction Example

abstract class DemoExample
{
 abstract void m1();
}
class Demo extends DemoExample
{
 void m1()
 {
  System.out.println("Inside m1 method");
 }
 public static void main(String[]args)
 {
  Demo d1=new Demo();
  d1.m1();
  
  DemoExample d2=new Demo();
  d2.m1();
 }
}