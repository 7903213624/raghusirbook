import java.util.Scanner;
class bk28 {
     public static void main(String[]args)  {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 
	 int l=(""+n).length();
	 int sq=n*n;
    int end=sq% (int)Math.pow(10,l);
	
	if(n==end)
	     System.out.print("automorphic number");
    else
	    System.out.print("non automorphic number");
		
		}
	}
	