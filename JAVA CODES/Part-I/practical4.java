import java.util.*;
class practical4{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);


        int ans=0;


        int c;
        do{


            System.out.print("Enter a  expenses name :");
            String  expenses=sc.nextLine();
    
            System.out.print("Enter a amount : \t");
            int amount=sc.nextInt();

            ans=ans+amount;

            
            System.out.println("Type any other key for exit :");
            System.out.println("Type 1 for exit :");
            c = sc.nextInt();

            sc.nextLine();


        }while(c!=1);
        System.out.println("---------------------------------");
        System.out.println("Your total expences amount is :"+ans);
    }
}