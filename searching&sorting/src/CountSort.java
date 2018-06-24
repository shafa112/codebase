
/*
* Counting sort is a sorting technique based on keys between a specific range. 
* It works by counting the number of objects having distinct key values
* (kind of hashing).
* 
* Complexity : O(n) 
*/
public class CountSort {

	//here we are sorting character array which are in range 0 to 255.
	//so count sort can be used because of range
	//and it can be to sort integer array with given range using similar logic
	public static void countSort(char[] a) {
		int n = a.length;
		int count[] = new int[256]; //256 is range 255-0+1
		//Traversing original array and incrementing the count of that index
		for(int i=0;i<n;i++)count[a[i]]++;
		//Finding cumulative sum
		for(int i=1;i<256;i++)count[i]+=count[i-1];
		
		char[] output = new char[n];
		
		for(int i=0;i<n;i++){
    		output[count[a[i]]-1] = a[i];
    		count[a[i]]--;
    	}
		
		for(int i=0;i<n;i++)a[i]=output[i];
	}
	
	
	public static void main(String[] args) {
		char a[] = "bbabbaac".toCharArray();
		int x= 'a';
		System.out.println(x);
		countSort(a);
		for(int i=0;i<a.length;i++)System.out.print(a[i]+" ");
	}
}
