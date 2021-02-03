package assignment8;

public class assignment {
	public static void main(String args[])
	{
		  int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		  
		  
		  bubblesort a=new bubblesort();
		  
		  a.bubbleSort(arr);
		  for(int i=0;i<arr.length;i++)
			  System.out.print(arr[i]+" ");
		  
	}

}
