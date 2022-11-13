import java.util.Scanner;
class basic4
{
    public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the side square");
	int side=sc.nextInt();
	System.out.println("Area "+side*side);
	System.out.println("perimeter "+4*side);
	}
}