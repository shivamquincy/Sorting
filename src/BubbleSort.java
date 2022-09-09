import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		 BubbleSort ob = new BubbleSort();
	        int n;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the Number of Elements: ");
	        n = sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter the elements of Array: "); 
	        for(int i=0; i<n; i++)  
	        {             
	        arr[i]=sc.nextInt();  
	        }  
	        System.out.println("Array elements are: ");  	          
	        for (int i=0; i<n; i++)   
	        {  
	        System.out.println(arr[i]);  
	        }  
	        ob.bubbleSort(arr);
	        System.out.println("Sorted Array:");
	        ob.printArray(arr);
	}
	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	
	 void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
}

