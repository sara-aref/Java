package com.techvidvan.stringtokenizer;
import java.util. * ;
import java.io. * ;

class Tokens {
	public static void main(String args[]) {
	
		int Count = 0;
		String sentence = "Given a sentence and a word your task is that to count the number of occurrences of the given word in the string and print the number of occurrences of the word.";
		String word = "occurrences";
		
		StringTokenizer sen = new StringTokenizer(sentence);
		while(sen.hasMoreTokens())
		{
			String nextstr = sen.nextToken();
			if(nextstr.equals(word))
			{
				Count++;
			}
		}
		
		
		System.out.println("number of occurrences of "+word+":"+Count);
	}
}
