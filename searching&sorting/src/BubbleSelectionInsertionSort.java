public class BubbleSelectionInsertionSort {

	public static void main(String[] args) {
		
		BubbleSelectionInsertionSort b = new BubbleSelectionInsertionSort();
		int[] a = {3,25,10,-1,8,19,12};
		//bubbleSort(a);
		//b.display(a);
		//selectionSort(a);
		//b.display(a);
		insertionSort(a);
		b.display(a);
		
	}
	
	public static void insertionSort(int[] a) {
		
		for(int i=0;i<a.length-1;++i)
		{
			int temp=a[i+1];
			int position=i+1;
			for(int j=i+1;j>0 && temp<a[j-1] ; --j)
			{
				if(temp<a[j-1])
				{
					a[j]=a[j-1];
					position=j-1;
				}
			}
			a[position]=temp;
		}
	}

	public static void selectionSort(int[] a) {
		
		for(int i = a.length-1 ;i>0; --i)
		{
			int position = i;
			for(int j = 0 ; j<i; ++j)
			{
				if(a[j]>a[position])position = j;
			}
			
			int temp = a[i];
			a[i]=a[position];
			a[position]=temp;
			
		}
	}

	public static void bubbleSort(int[] a) {
		
		for(int i = a.length-1 ;i>0 ;--i)
		{
			for(int j=0; j<i ;++j)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	
	
	public void display(int[] a)
	{
		for(int i = 0 ; i< a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
