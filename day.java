import java.util.Scanner;
public class day 
{
   private static Scanner s; 
   public static void main(String[] args)
    {
        int day;
        s = new Scanner(System.in);
        System.out.println("Input number: ");
        day = s.nextInt();

    switch (day) 
	{
            case 1: System.out.println("Monday"); 
		break;
            case 2: System.out.println("tuesday"); 
		break;
            case 3: System.out.println("Wednesday"); 
		break;
            case 4: System.out.println("Thursday"); 
		break;
            case 5: System.out.println("Friday"); 
		break;
            case 6: System.out.println("Saturday"); 
		break;
            case 7: System.out.println("Sunday"); 
		break;
            default: System.out.println("Invalid day range");
        }

        
    }
}
