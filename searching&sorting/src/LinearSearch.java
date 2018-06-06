import java.util.Scanner;

public class LinearSearch {
	
	
	public static void main(String[] args) {
		int array[] = {28,32,-1,3,1};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter element to search:");
		int element = s.nextInt();
		s.close();
		int succ = linearSearch(array, element);
		if(succ>=0)System.out.println("Element found at index:"+succ);
		else System.out.println("Element not found");
		
	}

	public static int linearSearch(int a[], int key)		//O(n)
	{
		for(int i=0;i<a.length;++i)
		{
			if(a[i] == key)return i;
		}
		return -1;
	}
	
}
