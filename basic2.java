import java.util.Scanner;
class basic2
{
    public static void main(String[]args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the radius of circle");
	 
	 double pie=3.1415;
	 float r=sc.nextFloat();
	 
	System.out.println("area= "+pie*r*r);
	System.out.println("circumference= "+ 2*pie*r);
	}
}