import java.util.Scanner;

//Can only be applied when array is sorted

public class BinarySearch {
	
	public static void main(String[] args) {
		int array[] = {10,20,30,40};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter element to search:");
		int element = s.nextInt();
		s.close();
		//int succ = binearSearch(array,element);
		int succ = binarySearchRecursive(array, 0, array.length-1, element);
		if(succ>=0)System.out.println("Element found at index:"+succ);
		else System.out.println("Element not found");
		
	}

	public static int binarySearch(int[] a, int key) {
		
		int low = 0;
		int high = a.length-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(a[mid]==key)return mid;
			else if(a[mid]<key)low=mid+1;
			else high=mid-1;
		}
		return -1;
	}
	
	public static int binarySearchRecursive(int[] a, int low, int high, int key) {
		if (low <= high) 
		{
			int mid = (low + high) / 2;
			//Checking if mid is equal
			if (a[mid] == key) return mid;
			//Searching the right part as key is greater than mid
			if (a[mid] < key) return binarySearchRecursive(a, mid + 1, high, key);
			//Searching the left part as key is less than mid
			else return binarySearchRecursive(a, low, mid - 1, key);
		}
		return -1;
	}

}
