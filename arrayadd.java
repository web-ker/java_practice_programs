import java.util.Scanner;
class arrayadd

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
	System.out.println("\n Enter 9 elements of array B: ");
	int B[][]=new  int [3][3];
	for(int k=0;k<3;k++)
	{
		for(int l=0;l<3;l++)
		{
			B[k][l]=sc.nextInt();
		}
	}

	System.out.println("\n Matrix of array A is: ");
	for(int m=0;m<3;m++)
	{
		for(int n=0;n<3;n++)
		{
			System.out.print(" ");
			System.out.print(A[m][n]);
		}
		System.out.println("\n");
	}
	System.out.println("\n Matrix of array B is: \n");
	for(int o=0;o<3;o++)
	{
		for(int p=0;p<3;p++)
		{
			System.out.print(" ");
			System.out.print(B[o][p]);
		}
		System.out.println("\n");
	}
	System.out.println("\n A+B=\n");
	int C[][]=new int [3][3];
	for(int q=0;q<3;q++)
	{
		for(int r=0;r<3;r++)
		{
			C[q][r]=A[q][r]+B[q][r];
			System.out.print(" ");
			System.out.print(C[q][r]);
		}
		System.out.println("\n");
		sc.close();
	}
  }
}