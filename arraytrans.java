import java.util.Scanner;
class arraytrans
{
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("\n Enter 9 elements of array A: ");
	int A[][]=new  int [3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			A[i][j]=sc.nextInt();
		}
	}
	System.out.println("\n Matrix of array A is: ");
	for(int k=0;k<3;k++)
	{
		for(int l=0;l<3;l++)
		{
			System.out.print(" ");
			System.out.print(A[k][l]);
		}
		System.out.println("\n");
	}
	System.out.println("\n A'=\n");
	int C[][]=new int [3][3];
	for(int m=0;m<3;m++)
	{
		for(int n=0;n<3;n++)
		{
			C[m][n]=A[n][m];
			System.out.print(" ");
			System.out.print(C[m][n]);
		}
		System.out.println("\n");
	}
  }
}