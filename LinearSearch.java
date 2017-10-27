package algorithms;
import java.io.*;
public class LinearSearch {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int search,pos;
		int []arr=new int[25];
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\tDemonstration of Linear Search\n\t@Nishant Amoli,Btech IT");
		System.out.print("\n\n\tEnter the elements in the array");
		// Enter the elements of array
		for(int i=0;i<25;i++)
			arr[i]=Integer.parseInt(stdin.readLine());
		
		//Display the entered elements
		System.out.println("You have entered these elements in the array\n");
		for(int i=0;i<25;i++)
			System.out.print(arr[i]+"\t");
		
		//Taking the element to be searched
		System.out.print("\nEnter the element you want to search: \t");
		search=Integer.parseInt(stdin.readLine());
		
		//Binary/Sequential Search
		for(int i=0;i<25;)
		{
			if(arr[i]==search)
			{
				pos=i+1;
				System.out.println("The Element was found at "+pos+"th position.");
				break;
			}
			else
			i++;	
		}
		

	}

}
