package practise.array;

public class FirstAndSecondMin {
	
	public static void main(String[] args) {
		int[] a= {1 ,4 ,45, 6 ,10 ,8,45,1};
		int m1=Integer.MAX_VALUE,m2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;++i)
		{
			if(m1>a[i])
			{
				m2=m1;
				m1=a[i];
			}
			else if(m2>a[i] && m1!=a[i])
			{
				m2=a[i];
			}
		}
		if(m2==Integer.MAX_VALUE)System.out.println(-1);
		else System.out.println(m1+" "+m2);
	}
	

}
