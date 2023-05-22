import java.util.Scanner; 
public class series
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int no;  
        double sum = 0;
        System.out.print("Enter number of terms in series : ");
        no = console.nextInt();
 
        for(int i = 1; i <= no; i++)
	{
            sum = sum + 1.0/i;
	}
 
        System.out.println("sum of series: " + sum);
    }  
}

