import java.util.Scanner;  
public class pattern2
{  
public static void main(String args[])  
{  
int r=5, i, j;   

 
for (i=0; i<r; i++)   
{       
for (j=2*(r-i); j>=0; j--)         
{        
System.out.print(" ");   
}     
for (j=0; j<=i; j++ )   
{         
System.out.print("* ");   
}   
System.out.println();   
}   
}   
}

    
  