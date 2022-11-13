import java.util.Scanner;
class book1
{
 public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
 System.out.println("enter the name");
  String name=sc.nextLine();
  
 System.out.println("enter your mobile no");
 long mobile=sc.nextLong();
 
 System.out.println("enter the percentage");
 float ten=sc.nextFloat();
 
 System.out.println("enter your 12th %");
 float t12=sc.nextFloat();
 
 System.out.println("enter the parcentageof degree");
 float degree=sc.nextFloat();
 
System.out.println("Name:"+ name);
System.out.println("mobile:"+mobile);
System.out.println("tenth parcentage"+ ten);
System.out.println("12th percentage"+ t12);
System.out.println("degree percentage"+ degree);
 }
}