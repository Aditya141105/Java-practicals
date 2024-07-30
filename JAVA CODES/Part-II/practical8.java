import java.util.*;

class practical8{

	public static void main(String args[])
	{
		int n;
		System.out.print("Enter length of array : ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int []arr=new int[n];
		int count=0;

		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]==9)
			{
				count++;
				}
		}
		System.out.print("The value of repeation is :"+count);
	}

}