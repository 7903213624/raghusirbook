import  java.util.Scanner;
class bk19   {
      public static void main(String[]args)
	  {
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b||b==c||c==a)
		   System.out.println("print diffrent number");
		else if(a>b&& a>b)
		    if(b>c)
			   System.out.println(b);
			 else
			    System.out.println(c);
		else if(b>c && b>a)
		    if(c>a)
			   System.out.println(c);
			else
			   System.out.println(a);
	    else if(c>a && c>b)
		     if(a>b)
			  System.out.println(a);
			else
			System.out.println(b);
			
	}
	}