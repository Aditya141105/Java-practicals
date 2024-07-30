public class practical11 {
    public static void main(String[] args) {
        String a="CHARUSAT UNIVERSITY";

        System.out.println("Legth of string is : "+a.length());

        

        StringBuilder b=new StringBuilder(a);

        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='H'){
                b.replace(i, i+1, "First LATTER OF YOUR NAME");
                i += "First LETTER OF YOUR NAME".length() - 1;
            }
            
        }
        System.out.println("Modified string is: " + b.toString());     
        System.out.println(a.toLowerCase());  
    }
}
