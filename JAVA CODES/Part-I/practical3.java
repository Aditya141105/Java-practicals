

import java.util.*;
class practical3{
	public static void main(String args[]){
		
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter a Distance in meters :");
		int d;
		d=s.nextInt();
		
		System.out.print("Enter Time (in hours) :");
		int hr;
		hr=s.nextInt();
		System.out.print("Enter Time (in minitus) :");
		int mm;
		mm=s.nextInt();
		System.out.print("Enter Time (in secondes) :");
		int ss;
		ss=s.nextInt();

		int timeh;
		timeh=hr+(mm/60)+(ss/3600);		

		float km;
		float miles;
		
		km=d/1000;
		miles=d/1609;
		
		int timem=(hr*3600)+(mm*60)+ss;

		System.out.print("Speed in km/h :");
		System.out.println(km/timeh);

		System.out.print("Speed in miles :");
		System.out.println(miles/timeh);

	System.out.print("Speed in m/s :");
	System.out.print(d/timem);
	}
}