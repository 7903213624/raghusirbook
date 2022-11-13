import java.util.Scanner;
class bk25 {
      public static void main(String[]args)  {
	  Scanner sc=new Scanner(System.in);
	  int n= sc.nextInt();
	  if(n%3==0&&n%5==0)
	      System.out.print("sanju weds manju");
	  else if(n%5==0)
	       System.out.print("manju");
	  else  if(n%3==0)
	      System.out.println("sanju");
	   else
	      System.out.println("breakup");
}
}