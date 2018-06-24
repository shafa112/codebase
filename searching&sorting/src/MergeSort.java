import algo.util.Util;

public class MergeSort {

	public static void mergeSort(int a[], int start, int end) {
		
		if(start<end)
		{
			int mid=start+(end-start)/2;
			mergeSort(a, start, mid);
			mergeSort(a, mid+1, end);
			simpleMerge(a, start, mid, end);
		}
	}
	
	
	//try simple merge for 1 2 3 | 4 5 6
	public static void simpleMerge(int a[], int start, int mid, int end) {
		
		int[] c = new int[end-start+1];
		int i=start,j=mid+1;
		int k=0;
		//Simple merging two arrays
		while(i<=mid && j<=end)
		{
			if(a[i]<a[j]) c[k++]=a[i++];
			else c[k++]=a[j++];
		}
		
		//putting the remaining elements
		while(j<=end) c[k++]=a[j++];

		//putting the remaining elements
		while(i<=mid) c[k++]=a[i++];

		k=0;
		
		for(i=start;i<=end;++i)a[i]=c[k++];
	}
	
	public static void main(String[] args) {
	   int a[] = {5,1,4,2,7,2,4};
	   Util.printArray(a);
	   mergeSort(a, 0, a.length-1);
	   Util.printArray(a);

	}

}
