public class Ex04
{
	public static void main (String[] args)
	{
		int row = 10;
		int count = 1;		
		
		for(int i=1; i<row; i++) 
		{
			for(int k = 0; k < row-i; k++) 
			{
				System.out.print(" ");
			}
			
			for(int j=0; j<i; j++) 
			{
				System.out.print(count%10 + " ");
				count++;
			}
			System.out.println();
		}
	}
}