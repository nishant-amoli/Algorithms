package algorithms;
import java.io.*;

public class BinarySearch {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int search,first=0,last=24,mid,temp,flag=0;
		int []arr=new int[25];
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\tDemonstration of Binary Search\n\t@Nishant Amoli,Btech IT");
		System.out.print("\n\n\tEnter the elements in the array");
		// Enter the elements of array
		for(int i=0;i<25;i++)
			arr[i]=Integer.parseInt(stdin.readLine());
		
		//Sorting the elements in increasing order
		for(int i=0;i<24;i++)
		{
			for(int j=0;j<24-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		//Displaying sorted array
		System.out.print("\nSorted array: \n ");
		for(int i=0;i<25;i++)
			System.out.print(arr[i]+"  ");
		//Taking the value for search
		System.out.print("Enter the element to be searched\n");
		search=Integer.parseInt(stdin.readLine());
		
		//BinarySearch
		while(first<=last && flag==0)
		{
			mid=(last+first)/2;
			if(search==arr[mid])
			{
				System.out.print("\n Element was found in "+(mid+1)+"th index." );
				flag=1;
			}
			if(search<arr[mid])
				last=mid;
			else
				first=mid;
		}
			
			

	}

}
