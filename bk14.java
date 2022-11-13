import java.util.Scanner;
class bk14  {
   public static void main(String[]args) {
   Scanner sc =new Scanner(System.in);
   System.out.println("enter the amount");
   double a=sc.nextDouble();
   
   System.out.println("enter rate");
   double  t=sc.nextDouble();
   
   System.out.println("enter the rate");
   double r=sc.nextDouble();
   
   double si=(a*r*t)/100;
   System.out.println(si);
   }
 }