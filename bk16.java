import java.util.Scanner;
class bk16 {
    public static void main(String[]args)  {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n==1)
	     System.out.println("sunday");
	 else if(n==2)
	     {
	      System.out.println("monday");
	     }
	 else if(n==3)
	    {
	      System.out.println("thuseday");
		}
	 else if(n==4)
	    {
	     System.out.println("wenesday");
		}
	else if(n==5)
	     {
	      System.out.println("thursday");
		 }
	else if(n==6)
	     {
	      System.out.println("friday");
		 }
	 else if(n==7)
	    {
	      System.out.println("satarday");
	     }
	  else
	    {
	    System.out.println("Invailid");
	    }
	 }
}