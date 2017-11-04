package algorithms;
import java.util.*;
public class QuickSort {
	static int partition(int []arr,int start,int end)
	{
		int pivot=arr[end];
		int partition_index=start;
		for(int i=start;i<end;i++)
		{
			if(pivot>=arr[i])
			{
				int temp=arr[i];
				arr[i]=arr[partition_index];
				arr[partition_index]=temp;
				partition_index+=1;
			}
		}
		int temp=arr[end];
		arr[end]=arr[partition_index];
		arr[partition_index]=temp;
		return partition_index;
	}
	static void qsort(int []arr,int start,int end)
	{
		if(start<end)
		{
			int partition=partition(arr,start,end);
			qsort(arr,start,partition-1);
			qsort(arr,partition+1,end);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\tDemonstration of Quick Sort\n\t@Nishant Amoli,Btech IT");
		System.out.print("\n\n\tEnter the size of the array");
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int []arr=new int[size];
		System.out.print("\n\tEnter the elements in the array");
		// Enter the elements of array
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		
		//Displaying the elements in the ordered the have been entered
		System.out.print("\nYou have entered :\n");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		
		//Quick Sort
		int start=0;
		int end=arr.length-1;
		qsort(arr,start,end);
		
		//Displaying the elements after Quick Sort
				System.out.print("\nElements after Quick Sort :\n");
				for(int i=0;i<size;i++)
					System.out.print(arr[i]+" ");

	}

}
