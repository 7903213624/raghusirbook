import java.util.Scanner;
 class bk13 {
      public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  boolean isspecial;
	  int s=n%10;
	  int f=n/10;
	 if((s+f)+(s*f)==n)
	     System.out.println("Special number");
	else
	    System.out.println("not specail number");
	}
	
	}
	  