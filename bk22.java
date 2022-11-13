import java.util.Scanner;
class bk22{
    public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	int temp=no;
	int rev=0,rem;
	
	while(temp!=0)
	{
	   rem=temp%10;
	    rev=rev*10+rem;
	    temp=temp/10;
	}
	if(rev==no)
	 {
		System.out.println("palindrome");
	 }
	 else
	 {
		 System.out.println("not palindome");
		 
	 }
	 
	}
}
	
	
	
	