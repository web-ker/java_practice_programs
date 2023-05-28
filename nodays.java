import java.util.Scanner;
public class  nodays 
{
  public static void main(String[] strings) 
{
        Scanner input = new Scanner(System.in);
        int no= 0; 
        String month = " ";
	System.out.print("Input a month number: ");
        int mon = input.nextInt();
	System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (mon)
 {
            case 1: month = "January"; no = 31;
                break;
            case 2: month = "February"; no = 28;
               break;
            case 3: month = "March"; no = 31;
                break;
            case 4: month = "April"; no = 30;
                break;
            case 5: month = "May"; no = 31;
                break;
            case 6: month = "June"; no = 30;
                break;
            case 7: month = "July"; no = 31;
                break;
            case 8: month = "August"; no = 31;
                break;
            case 9: month = "September"; no= 30;
                break;
            case 10: month = "October"; no = 31;
                break;
            case 11: month = "November"; no = 30;
                break;
            case 12: month = "December"; no = 31;
        }
System.out.print(month + " " + year + " has " + no + " days\n");
    }
}

