import java.util.Scanner;

public class Smallest
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();

	if(a==b && b==c)
	{	
		System.out.println("All values are equal");
	}

	else
	{
	

	if(a<b && a<c)
	{
		System.out.println("A is smaller");
	} 
	else if(b<c)
	{	
		System.out.println("B is smaller");
	}
	else
	{
		System.out.println("C is smaller");
	}
	}
	}
}