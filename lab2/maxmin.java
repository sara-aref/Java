class maxmin {
	public static void main(String args[]) {
	
		int i;
		int arr [] = new int [1000];
		for (i = 0; i<arr.length; i++)
		{
			arr [i] = (int)(Math.random()*1000);
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for (i = 1; i<arr.length; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
			else
			{
				min = arr[i];
			}
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
	}
}
