
import java.util.Scanner;
public class Diamond 
{
 
public static void main(String[] args)
{
 
Scanner scanner=new Scanner(System.in);
System.out.println("Enter No.: ");
int row=scanner.nextInt(); 
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=row-i;j++)
 
	{
		System.out.print(" ");
	}
 
	for(int j=1;j<=i*2-1;j++) 
	{
		System.out.print("*");
	}
		System.out.println();
	} 
	for(int i=row-1;i>0;i--)
	{
	for(int j=1;j<=row-i;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i*2-1;j++) 
	{
		System.out.print("*");
	}
		System.out.println();
}
 
}
}