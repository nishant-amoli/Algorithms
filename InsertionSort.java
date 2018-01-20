package algorithms;
import java.io.*;
public class InsertionSort {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int []arr=new int[100];
		int n,key,i,j;
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\tDemonstration of Insertion Sort\n\t@Nishant Amoli,Btech IT");
		System.out.print("\n\n\tEnter the size of the array");
		n=Integer.parseInt(stdin.readLine());
		System.out.print("\n\tEnter the elements in the array");
		// Enter the elements of array
		for(i=0;i<n;i++)
			arr[i]=Integer.parseInt(stdin.readLine());
		
		//Displaying the elements in the ordered the have been entered
		System.out.print("\nYou have entered :\n");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
		//Insertion Sort
		for(i=1;i<n;i++)
		{
			key=arr[i];
			for(j=i-1;j>=0 && arr[j]>key;j--)
				arr[j+1]=arr[j];
			
			arr[j+1]=key;
		}
		//Displaying the sorted array
		System.out.print("\nArray after Insertion Sort :\n");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		  hello;

	}

}
