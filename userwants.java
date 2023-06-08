import java.util.Scanner; 
public class userwants 
{ 
    public static void main(String[] args) 
    { 
        

	Scanner scan=new Scanner(System.in); 
        char ch; 
        int n=0,p=0,z=0,no; 

	System.out.println("Enter 'S' to contine"); 
        ch=scan.next().charAt(0);

        for(int c=1;ch=='S';c++) 
        { 
        
            System.out.println("Enter the number: "); 
            no=scan.nextInt(); 
            if(no==0) 
                ++z; 
            else if(no>0) 
                ++p; 
            else if(no<0) 
                ++n; 
            System.out.println("Enter 'S' to contine"); 
            ch=scan.next().charAt(0); 
        } 
        System.out.println("Negative Integers: "+n); 
        System.out.println("Positive Integers: "+p); 
        System.out.println("Zero's: "+z); 
        scan.close(); 
    } 
} 