import java.util.Scanner;
class basic3
 {
     public static void main (String[]args)
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the length of retangle");
	 double l=sc.nextDouble();
	 System.out.println("enter the length of retangle");
	 double b=sc.nextDouble();
	 
	 
	 System.out.println("area= "+(l*b));
	 System.out.println("parimeter= "+(2*(l+b)));
	 }
}