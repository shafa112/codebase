import algo.util.Util;

public class QuickSort {

	public void quickSort(int[] a,int start,int end)
	{
		if(start<end)
		{
			int pivot = partition(a,start,end);
			quickSort(a, start, pivot-1);
			quickSort(a, pivot+1, end);
		}
	}
	
	public int partition(int[] a, int start, int end) {
		
		int pivot=end;
		int pi=start;
		for(int i=start;i<end;++i)
		{
			if(a[i]<a[pivot])
			{
				int temp=a[pi];
				a[pi]=a[i];
				a[i]=temp;
				++pi;
			}
		}
		
		int temp=a[pi];
		a[pi]=a[pivot];
		a[pivot]=temp;
		
		return pi;
	}
	

	public static void main(String[] args) {
		//int[] a = {3,25,10,-1,8};
		//int a[] = {5,1,4,2,7,2,4};
		int a[] = {2,1};
		QuickSort s = new QuickSort();
		s.quickSort(a,0,a.length-1);
		Util.printArray(a);
	}
	
	

}
