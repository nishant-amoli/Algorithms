package algorithms;
import java.io.*;
public class CountingSort {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int []arr=new int [100];
		int []count=new int[100];
		int []sumcount=new int[100];
		int []sorted=new int[100];
		int min=0,max=0;
		int n;
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\tDemonstration of Counting Sort\n\t@Nishant Amoli,Btech IT");
		System.out.print("\n\tEnter the size of the array\n");
		n=Integer.parseInt(stdin.readLine());
		System.out.print("\n\tEnter the elements in the array");
		// Enter the elements of array
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(stdin.readLine());
		
		//Displaying the elements in the ordered the have been entered
		System.out.print("\nYou have entered :\n");
		for(int i=1;i<=n;i++)
			System.out.print(arr[i]+" ");
		
		//Finding maximum and minimum elements
		for(int i=1;i<=n;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.print("\n Min:"+min +" \tMax:"+ max);
		
		//Filling the total counts of elements in count array
		for(int i=min;i<=max;i++)
			count[i]=0;
		
		for(int i=1;i<=n;i++)
		{
			int temp=arr[i];
			count[temp]+=1;
		}
		System.out.print("\n\n Count Array:");
		for(int i=min;i<=max;i++)
		{
			System.out.print("\n "+i+"th index:"+count[i]);
		}
		//Implementing SumCount Array
		for(int i=min;i<=max;i++)
			sumcount[i]=0;
		sumcount[min]=count[min];
		for(int i=min+1;i<=max;i++)
		{
			sumcount[i]=sumcount[i-1]+count[i];
		}
		
		//Displaying sumcount array
		System.out.print("\n\n SumCount Array:");
		for(int i=min;i<=max;i++)
			System.out.print("\n "+i+"th index:"+sumcount[i]);
		
		//SortedArray
		for(int i=1;i<=n;i++)
		{
			int temp=arr[i];
			int sortedindex=sumcount[temp];
			sorted[sortedindex]=temp;
			sumcount[temp]--;
		}
		System.out.print("\n\n Array After Counting Sort:\n\n");
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+sorted[i]+"\t");
		}
		
		

	}

}
