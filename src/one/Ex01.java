package one;

public class Ex01
{
	public static void main(String[] args)
	{
//		int n = 10;
//		
//		int i =1;
//		
//		while (i<=n)
//		{
//			System.out.println(i);
//			i++;
//		}
//		int j=1;
//		for (;j<=n;)
//		{
//			System.out.println(j);
//			j++;
//		}
		
		
//		int n = 20;
//		int i =1;
//		boolean flag = true;
//		while (i<=n)
//		{
//			System.out.println(i);
//			if (flag)
//				i++;
//			else
//				i+=2;
//			flag = !flag;
//		}
		int n =20;
		int i;
		boolean flag;
		for (i = 1, flag = true ; i <= n ; i++, flag = !flag)
		{
			System.out.println(i);
			if(!flag)
				i++;
		}
	}
}