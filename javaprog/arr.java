import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class arr
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int temp;
	int[] arr = new int[size];
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = s.nextInt();
	}
	
	for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
{
	if(arr[i]>arr[j])	
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;		

                    System.out.println("After swapping " + arr[i] + " and " + arr[i + 1] + ":");
		}

}
}

	for(int array : arr)
	{
		System.out.print(array+" ");
	}
	}
}