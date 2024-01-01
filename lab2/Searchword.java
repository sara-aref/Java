class Searchword {
	public static void main(String args[]) {
	
		int Count = 0;
		String sen = "Given a sentence and a word your task is that to count the number of occurrences of the given word in the string and print the number of occurrences of the word.";
		String word = "occurrences";
		String arr [] = sen.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			if(word.equals(arr[i]))
			{
				Count++;
			}
		}
		System.out.println("number of occurrences of "+word+":"+Count);
	}
}
