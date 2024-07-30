import java.util.*;
class practical7{

	static void func1(String str,int n)
	{
		String sub=str.substring(0,3);
		for(int i=0;i<n;i++)
		{
			System.out.print(sub);
		}
	}
	public static void main(String args[])
		{
			int n;
			Scanner sc= new Scanner(System.in);
			String str;
			System.out.print("Enter string : ");
			str=sc.next();
			System.out.println();
			System.out.print("Enter value of repatetion :");
			n=sc.nextInt();
			func1(str,n);
			
			
		}

}