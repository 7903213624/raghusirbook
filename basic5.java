import java.util.Scanner;
class basic5 {
     public static void main(String[]args) {
	 System.out.println("enter the centimer");
	 Scanner sc=new Scanner(System.in);
	 double n=sc.nextDouble();
	System.out.println("In Meter "+ n/100);
	System.out.println("In foot "+ n/30.48);
	}
	}