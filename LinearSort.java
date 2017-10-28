package algorithms;
import java.io.*;
public class LinearSort {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int []arr=new int[100];
		int n;
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\tDemonstration of Linear Sort\n\t@Nishant Amoli,Btech IT");
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
		
		//Linear Sort
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		//Displaying the sorted array
		System.out.print("\nArray after Linear Sort :\n");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");

	}

}
