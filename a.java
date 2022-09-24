// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Main
 {
     int a=9;
     int b=9;
     private int add()
     {
         return a+b;
     }
     int result()
     {
         return new Main().add();
     }
 }

public class Examp3 {
    public static void main(String []aa)
     {
         Main e=new Main();
         System.out.println(2*e.result());
     }
 }
