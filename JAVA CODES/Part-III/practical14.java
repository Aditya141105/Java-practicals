
import java.util.Scanner;

class Date {
    private int month;
    private int day;
    private int year;


    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    
    public void setMonth(int month) {
        this.month = month;
    }

    
    public int getDay() {
        return day;
    }

    
    public void setDay(int day) {
        this.day = day;
    }

    
    public int getYear() {
        return year;
    }

    
    public void setYear(int year) {
        this.year = year;
    }

    
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
public class practical14{
    public static void main(String[] args) {
       
        Date myDate = new Date(7, 30, 2024);

       
        myDate.displayDate();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day :" );
        int day;
        day=sc.nextInt();
        myDate.setDay(day);
        System.out.println("Enter Month :" );
        int month;
        month=sc.nextInt();
        myDate.setMonth(month);
        System.out.println("Enter Year :" );
        int year;
        year=sc.nextInt();
        myDate.setYear(year);

      
        
        myDate.displayDate();

        // Use getters to print individual components
        System.out.println("Month: " + myDate.getMonth());
        System.out.println("Day: " + myDate.getDay());
        System.out.println("Year: " + myDate.getYear());
        sc.close();
    }
}

