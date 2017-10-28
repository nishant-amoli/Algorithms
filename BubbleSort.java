package algorithms;
import java.io.*;
public class BubbleSort {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int []arr=new int[100];
		int n;
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\tDemonstration of Bubble Sort\n\t@Nishant Amoli,Btech IT");
		System.out.print("\n\n\tEnter the size of the array");
		n=Integer.parseInt(stdin.readLine());
		System.out.print("\n\tEnter the elements in the array");
		// Enter the elements of array
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(stdin.readLine());
		
		//Displaying the elements in the ordered the have been entered
		System.out.print("\nYou have entered :\n");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
		//Bubble Sort
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//Displaying the sorted array
		System.out.print("\nArray after Bubble Sort :\n");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		

	}

}
