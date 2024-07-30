/*An electric appliance shop assigns code 1 to motor,2 to
fan,3 to tube and 4 for wires. All other items have code 5 or
more. While selling the goods, a sales tax of 8% to
motor,12% to fan,5% to tube light,7.5% to wires and 3%
for all other items is charged. A list containing the product
code and price in two different arrays. Write a java
program using switch statement to prepare the bill. */
import java.util.*;
public class practical5 {

    public static void main(String[] args) {
        System.out.println("------------------Welcome T0 Aditya Store---------- ");
        Scanner sc = new Scanner(System.in);
        double bill=0;
        int choice;
        int price;
        do{
            System.out.println("Enter 1 for Motor");
            System.out.println("Enter 2 for Fan");
            System.out.println("Enter 3 for Tube");
            System.out.println("Enter 4 for Wires");
            System.out.println("Enter 5 for Other items");
            System.out.println("Enter 6 for exit");
            
             choice=sc.nextInt();

            switch (choice) {
                case 1:
                    {
                        System.out.print("Enter amount of motor :");
                        price=sc.nextInt();
                        bill=bill+price*0.08;
                        break;
                    }
                case 2:
                {
                    System.out.print("Enter amount of fan :");
                    price=sc.nextInt();
                    bill=bill+price*0.12;
                    break;
                }
                case 3:
                {
                    System.out.print("Enter amount of Tube :");
                    price=sc.nextInt();
                    bill=bill+price*0.05;
                    break;
                }
                case 4:
                {
                    System.out.print("Enter amount of Wiers :");
                    price=sc.nextInt();
                    bill=bill+price*0.075;
                    break;
                }
                case 5:
                {
                    System.out.print("Enter amount of other item :");
                    price=sc.nextInt();
                    bill=bill+price*0.03;
                    break;
                }
            }



        }while(choice!=6);

        System.out.println("Your total amount is :"+bill);
    }
    
}