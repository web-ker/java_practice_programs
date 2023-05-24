import java.util.Scanner;
public class pattern3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
       
 	int i,j,r=5,p=1;
 
        for ( i = r; i > 0; i--)
        {
          
            for ( j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
 
            
            for ( j = 1; j <= p; j++)
            {
                System.out.print(p+" ");
            }
 
            System.out.println();
 
            p++;
        }
    }
}

