package practise.array;

public class PairWithSumK {

	public static int isPairWithSumK(int[] a, int sum) {
		int f=0;
		int l=a.length-1;
		while(f<l)
		{
			if(a[f]+a[l]==sum)return 1;
			if(a[f]+a[l]>sum)--l;
			else ++f;
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		int a[] = {1 ,4 ,45, 6 ,10 ,8};
		MergeSort.mergeSort(a, 0, a.length-1);
		System.out.println(isPairWithSumK(a,46));
		//System.out.println(Math.abs(-5));
	}


}
