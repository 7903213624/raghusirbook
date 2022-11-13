import java.util.Scanner;
class loop2  {
     public static void main(String[]args)  {
	 Scanner sc =new Scanner(System.in);
	 int n=sc.nextInt();
	 
	 for(int i=1;i<=n;i++)
	 {
		 int prime=0;
	   for(int j=2;j<i-1;j++)
	   {
		   if(i%j==0)
		   {
			  prime=prime+1;
			 }
	   }
	  if(prime==0)
	  {
		  System.out.print(" "+i);
	  }
	  
	  
	 }
	 }
}