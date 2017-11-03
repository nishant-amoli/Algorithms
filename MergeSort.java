package algorithms;
import java.util.*;
public class MergeSort {
	static void Merge(int []left,int []right,int[]arr)
	{
		int i=0,j=0,k=0;		
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
				arr[k++]=left[i++];									
			else
				arr[k++]=right[j++];							
		}
		while(i<left.length)
			arr[k++]=left[i++];
						
		while(j<right.length)
			arr[k++]=right[j++];					
	}
	static int Sort(int[] arr)
	{
		if(arr.length<2)
			return 0;
		int mid=arr.length/2;
		int [] left=new int[mid];
		int []right=new int[arr.length-mid];
		for(int i=0;i<mid;i++)
			left[i]=arr[i];
		for(int i=mid;i<arr.length;i++)
			right[i-mid]=arr[i];
		Sort(left);
		Sort(right);
		Merge(left,right,arr);
		return 1;
			
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.print("\tDemonstration of Merge Sort\n\t@Nishant Amoli,Btech IT");
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
		
		//Merge Sort
		Sort(arr);
		
		//Displaying the elements after the Merge Sort
				System.out.print("\nArray after Sorting :\n");
				for(int i=0;i<size;i++)
					System.out.print(arr[i]+" ");
		
		
	}

}
