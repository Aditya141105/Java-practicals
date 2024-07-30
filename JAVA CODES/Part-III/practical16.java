
import java.util.Scanner;
class complex{
    int x;
    int y;
    complex(){
        
    }
    complex(int a,int b)
    {
        x=a;
        y=b;
    }
    public complex add(complex o){
        complex temp=new complex();
        temp.x=x+o.x;
        temp.y=y+o.y;
        return temp;
    }
    public complex sub(complex o){
        complex temp=new complex();
        temp.x=x-o.x;
        temp.y=y-o.y;
        return temp;
    }
    public complex div(complex o){
        complex temp=new complex();
        temp.x=x/o.x;
        temp.y=y/o.y;
        return temp;
    }
    public void display(){
        if (y < 0) {
            System.out.println(x + " - " + Math.abs(y) + "i");
        } else {
            System.out.println(x + " + " + y + "i");
        }
    }
}
public class practical16 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter real part of number 1 :");
        a=sc.nextInt();
        System.out.println("Enter Imaginary part of number 1 :");
        b=sc.nextInt();
        complex num1=new complex(a,b);
        System.out.println("Enter real part of number 2 :");
        c=sc.nextInt();
        System.out.println("Enter Imaginary part of number 2 :");
        d=sc.nextInt();
        complex num2=new complex(a,b);

        complex sum=num1.add(num2);
        System.out.print("Sum: ");
        sum.display();

        complex diff=num1.sub(num2);
        System.out.print("Difference: ");
        diff.display();
        
        complex division=num1.div(num2);
        System.out.print("Division: ");
        division.display();
    }
}
