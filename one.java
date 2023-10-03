abstract class two
{
 abstract void m1();
}
class one extends two
{
 /* void m1()
 {
  System.out.println("inside m1 method");
  }*/
  
  public static void main(String[]args)
  {
   two t2=new one();
   t2.m1();
   }
  }
 /* As seen above example if method in parent class is abstract and it that method
 is not overriden within the child then child class by nature will become abstract */