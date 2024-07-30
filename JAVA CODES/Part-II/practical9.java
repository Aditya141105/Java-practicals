
import java.util.Scanner;

public class practical9 {

    static StringBuilder  double_char(String orignal){
        StringBuilder d=new StringBuilder();

        int i=0;

        while(i<orignal.length())
        {
            d.append(orignal.charAt(i));
            d.append(orignal.charAt(i));
            i++;
        }
        return d;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string :");


        String orignal=sc.nextLine();

        StringBuilder changed=double_char(orignal);
        System.out.println(changed.toString());
        sc.close();
    }
}
