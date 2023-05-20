import java.util.Scanner;
public class factorial
{
    public static void main(String[] args) 
{
        int no,i=1;
        long fact = 1;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        no = scanner.nextInt();
        scanner.close();
        while(i<=no)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+no+" is: "+fact);
    }
}

