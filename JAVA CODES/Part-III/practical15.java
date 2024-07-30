
import java.util.Scanner;



class Area{
    int length;
    int width;
    Area(int a,int b){
        length=a;
        width=b;
    }
    public int returnArea(){
        return length*width;
    }
}
public class practical15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length: ");
        int a = sc.nextInt();
        System.out.print("Enter the width: ");
        int b = sc.nextInt();
        Area c=new Area(a,b);

        int ans=c.returnArea();
        System.out.println(ans);
    }
}
