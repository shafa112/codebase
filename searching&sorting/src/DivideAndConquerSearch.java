
//Can be applied even if array is not sorted
public class DivideAndConquerSearch {

	public static int search(int a[], int start, int end, int key) {
		if(start<=end) {
			
			int mid = (start+end)/2;
			//checking if the middle element is the key
			if(a[mid]== key)return mid;
			//search the left part
			int leftResultofSearch = search(a, start, mid-1, key);
			//search right part
			int rightResultofSearch = search(a, mid+1, end, key);
			
			if(leftResultofSearch !=-1)return leftResultofSearch;
			else return rightResultofSearch;
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = {3,1,7,2};
		System.out.println(search(a,0,a.length-1,10));
	}

}
