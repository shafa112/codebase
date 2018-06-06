
public class Prac {

	public static void main(String[] args) {
		
		//swap 2 no. without 3rd variable
		int a = 5;
		int b = 10;
		System.out.println(a+"and"+b);
		b = a + b;
		a = b - a;
		b = b - a;
		System.out.println(a+"and"+b);
		
		System.out.println("-------------------------------------------");
		/*
			Print below pattern
			1 
			1 2 
			1 2 3 
		*/
		int n=3;
		for(int i=1 ; i<=n ; ++i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		/*
		Print below pattern
			1 
			2 3 
			4 5 6
		 */
		n=3;
		int k=1;
		for(int i=1 ; i<=n ; ++i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print(k+" ");
				++k;
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		n=3;
		for(int i=1 ; i<=n ; ++i)
		{
			for(int j=1;j<=n-i+1;++j)
			{
				System.out.print("*"+" ");
				++k;
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		k=n-1;
		for(int i=1;i<=n;++i)
		{
			k=n-i;
			for(int j=1;j<=i;++j)
			{
				while(k>0)
				{
					System.out.print(" ");
					--k;
				}
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		for(int i=1 ; i<=n ; ++i)
		{
			k=i-1;
			while(k>0)
			{
				System.out.print(" ");
				--k;
			}
			for(int j=1;j<=n-i+1;++j)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}
		
		

	}


}
