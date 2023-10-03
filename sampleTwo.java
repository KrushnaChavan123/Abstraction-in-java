abstract class sampleOne
{
 abstract void m1();
 abstract void m2();
 abstract void m3();
}
class sampleTwo extends sampleOne
{
 void m1()
 { 
 System.out.println("Inside m1 method");
 }
 void m2()
 {
  System.out.println("inside m2 method");
 }
 void m3()
 {
  System.out.println("inside m3 method");
 }
 
public static void main(String[]args)
{
 sampleOne s1=new sampleTwo();
 s1.m1();
 s1.m2();
 s1.m3();
}
}
 
 