import java.util.*;



public class practical10 {
    static String reverse(String fun) {
        String a = "";
        for (int i = fun.length() - 1; i >= 0; i--) {
            a = a + fun.charAt(i);
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner sc=new Scanner(System.in);

        String fun=sc.nextLine();
        //StringBuilder fun1= new StringBuilder(fun);
        System.out.println("Length of String is :" + fun.length());


        
        System.out.println("String in lower case : " + fun.toLowerCase());
        System.out.println("String in upper case : " + fun.toUpperCase());
        
        String r = reverse(fun);
        System.out.println("Reversed string: " + r);

        char[] charArray= fun.toCharArray();
        Arrays.sort(charArray);
        String sorted=new String(charArray);

        System.out.println("Sorted String is : " + sorted);

        
        
    }
}
