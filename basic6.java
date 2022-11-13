import java.util.Scanner;
class basic6
{
    public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the first no");
	int a=sc.nextInt();
	System.out.println("enter the 2nd number");
	int b=sc.nextInt();
	
	System.out.println("Add "+ (a+b));
	System.out.println("Sub "+ (a-b));
	System.out.println("divide "+ a/b);
	System.out.println("multiply "+ a*b);
	}
}