
import java.util.Scanner;



public class practical12 {
    public static void main(String[]  args) {
        int a=100;
        int b=Integer.parseInt(args[0]);
        System.out.println("BY using argument");
        System.out.println("In rupees :"+b*a);

        Scanner s=new Scanner(System.in);
        System.out.println("Enter Value in pound : ");
        int c=s.nextInt();
        System.out.println("In rupees :"+c*a);

    }
}
