import java.util.Scanner;
public class integers 
{
private static Scanner sc;
public static void main(String[] args) 
{
	int no, i, in, evensum = 0, oddsum = 0;
	sc = new Scanner(System.in);
		
	System.out.print(" Enter number of integers  : ");
	no = sc.nextInt();	
		
	for(i = 1; i <= no; i++)
	{
	    System.out.print(" Enter integer no.  : ");
	    in = sc.nextInt();	
		
		if(in % 2 == 0)
		{
		    evensum = evensum + in; 
		}
		else
		{
		    oddsum = oddsum + in;
		}
		}
	System.out.println("\n The Sum of Even Integers  =  " + evensum);
	System.out.println("\n The Sum of Odd Integers  =  " + oddsum);
	}
}
