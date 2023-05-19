import java.util.Scanner;  
public class sum12100
{  
public static void main(String[] args)   
{     
int i=1,no=100,sum = 0; 
Scanner sc = new Scanner(System.in);    
while(i <= no)  
{    
sum = sum + i;  
i++;  
}  
System.out.println("Sum of Natural Numbers from 1 to 100 = " + sum);  
}  
}  

