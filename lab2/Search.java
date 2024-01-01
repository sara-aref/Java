class Search {
	public static void main(String args[]) {
		long Time_start = System.nanoTime();
		System.out.println ("Initial program starting time: " + Time_start);
		
		int i,j;
		int arr [] = new int [1000];
		for (i = 0; i<arr.length; i++)
		{
			arr [i] = (int)(Math.random()*1000);
		}
		
		for (i = 0; i<arr.length-1; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				int temp = 0;
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		binarySearch(arr, 1000, 958);
		
		long nano_estimated_Time = System.nanoTime();
		long timeDifference = nano_estimated_Time - Time_start;
		
		System.out.println("Time taken to complete the execution of code in nanoseconds : "+nano_estimated_Time);
		System.out.println("Time taken to complete the execution of code in nanoseconds: " + timeDifference);
	}


public static void binarySearch(int arr[], int Size, int key)
	{  
 		int first = 0;
 		int last = Size-1;
		while( first <= last )
		{ 
			int mid = (first + last)/2;
			if ( arr[mid] < key )
			{  
				first = mid + 1;     
			}
			else if ( arr[mid] > key )
			{  
				last = mid - 1;
			}
			else
			{  
				System.out.println("Element is found at index: " + mid);  
        			break;  
			}  
		}  
		if ( first > last )
		{  
			System.out.println("Element is not found!");  
		}  
	}
}
