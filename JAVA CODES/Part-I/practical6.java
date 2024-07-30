
import java.util.Scanner;

public class practical6 {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        Scanner s= new Scanner(System.in);

        System.out.print("Enter number of day :");
        int n=s.nextInt();
        int ans=1;
        if(n==1||n==0)
        System.out.println(n);
        
        else{
            for(int i=2;i<n;i++)
            {
                ans=first+second;
                first=second;
                second=ans;

            }
        }
        System.out.println(ans);


    }
}
