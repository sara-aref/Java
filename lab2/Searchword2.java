class Searchword2 {
	public static void main(String args[]) {
	
		int Count = 0;
		String sen = "Given a sentence and a word your task is that to count the number of occurrences of the given word in the string and print the number of occurrences of the word.";
		String word = "occurrences";
		
		int index = sen.indexOf(word);

       		 while (index != -1)
       		 {
            		Count++;
            		index = sen.indexOf(word, index + 1);
        	}
		
		System.out.println("number of occurrences of "+word+":"+Count);
	}
}
