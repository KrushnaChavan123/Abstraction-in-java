//Create incomplete static method in abstract class

abstract class Two
{
 abstract static void m1();
 {
 }
}
class One extends Two
{
    static void m1()
 {
  System.out.println("Inside m1 method");
 }
}
class OK
{
 public static void main(String[]args)
 {
  Two t1=new One();
  t1.m1();
 }
}
/*
illegal combination of modifiers: abstract and static
 abstract static void m1();
                      ^
*/					  
  