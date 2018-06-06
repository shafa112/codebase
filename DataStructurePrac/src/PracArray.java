import java.util.ArrayList;
import java.util.Arrays;

import algo.util.Util;

public class PracArray {
	
	int y;

	public static void main(String[] args) {
		
		//ArrayList Of Integers
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(5);
		for(int i=0;i<al.size();++i)
		{
			System.out.println(al.get(i));
		}
		
		//using for each
		for(Integer x : al)
		{
			System.out.println(x);
		}
		
		//using toString()
		System.out.println("Print al with toString explicitly");
		System.out.println(al.toString());
		
		//ArrayList has toString()
		System.out.println("Print al without toString explicitly");
		System.out.println(al); //sysout automatically calls toString for any variable we print inside it
		
		PracArray p1 = new PracArray();
		p1.y = 20;
		PracArray p2 = new PracArray();
		p2.y = 50;
		
		//ArrayList Of PracArray
		ArrayList<PracArray> pl = new ArrayList<>();
		pl.add(p1);
		pl.add(p2);
		
		//using toString()
		System.out.println("Printing arraylist having pracArray objects");
		//System.out.println(pl.toString());
		System.out.println(pl);
		
		//using for each
		for(PracArray p : pl)
		{
			//System.out.println(p);
		}
		//creating array of class PracArray
		PracArray ar[] = new PracArray[2];
		//adding elements to ar
		ar[0] = p1;
		ar[1] = p2;
		
		System.out.println("Printing array");
		System.out.println(ar); //because there is no String in builtin array []
		
		System.out.println("Printing array using Arrays Class in java util");
		System.out.println(Arrays.toString(ar));
		
		//Creating array of ArrayList
		ArrayList<Integer> alistarray[] = new ArrayList[3];
		//add elements to array of ArrayList
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(25);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(50);
		al2.add(51);
		
		alistarray[0] = al1;
		alistarray[1] = al2;
		
		//Print all elements of alistarray
		System.out.println("Print all elements of alistarray");
		System.out.println(alistarray);
		
		System.out.println("Print all elements of alistarray using Arrays class toString");
		System.out.println(Arrays.toString(alistarray));
		
		//print contents of al2 in alistarray
		System.out.println("printing al2 of alistarray");
		System.out.println(alistarray[1]);
		
		
		System.out.println("printing alistarray using for loop");
		for(int i=0;i<alistarray.length;++i)
		{
			System.out.println(alistarray[i]);
		}
		
		
		System.out.println("printing all no.s of alistarray using for loop one by one");
		for(int i=0;i<alistarray.length;++i)
		{
			if(alistarray[i]!=null)
			{
				for(int j=0;j<alistarray[i].size();++j)
				{
					System.out.println(alistarray[i].get(j));
					
				}
			}
		}
		
		System.out.println("printing alistarray using for each");
		for(ArrayList<Integer> alist : alistarray)
		{
			System.out.println(alist);
		}
		
		System.out.println("printing all no.s of alistarray using for each one by one");
		for(ArrayList<Integer> alist : alistarray)
		{
			if(alist != null)
			{
				for(Integer val : alist)
				{
					System.out.println(val);
				}
			}
		}
		
		
		//ArrayList of array using Object class
		System.out.println("Printing arraylist of array");
		int ar1[]= {1,2,3};
		//Object obj1 = ar1;
		int ar2[]= {9,10,11,12};
		//Object obj2 = ar2;
		//int b[] = (int[])obj;
		ArrayList<Object> alistOfarray = new ArrayList<>();
		alistOfarray.add(ar1);	//alistOfarray.add(obj1); if we uncomment above commented line
		alistOfarray.add(ar2);
		for(Object ob : alistOfarray)
		{
			for(Integer val : (int[])ob)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
		System.out.println("ArrayList of array without using Object class");
		ArrayList<int[]> x= new ArrayList<>();
		x.add(ar1);
		x.add(ar2);
		for(int arr[]:x) {
			Util.printArray(arr);
		
		}
		
	}
	
	//if you don't override toString it will print object address
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(y);
		return builder.toString();
	}
	
	//Read from NoteBook Also

}
