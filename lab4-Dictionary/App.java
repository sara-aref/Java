import java.util.*;

public class App
{
    Map<Character, TreeSet<String>> mapping = new TreeMap<>();

    public static void insert (Map<Character, TreeSet<String>> map, TreeSet<String> words) {
		for (String element : words) {
            char c = element.toUpperCase().charAt(0);
            if(map.containsKey(c))
            {
                TreeSet<String> treeset = getWords(map, c);
                treeset.add(element);
                System.out.println("Word '" + element + "' inserted successfully.");
            }
            else
            {
                System.out.println("word doesn't match any key");
            } 
        }
	}
    
	public static void printDictionary(Map<Character, TreeSet<String>> map) {
        if (map.isEmpty())
        {
            System.out.println("The dictionary is empty.");
        }
        else
        {
            map.forEach((key, value) -> System.out.println(key+": "+value));
        }
	}
	
	public static TreeSet<String> getWords(Map<Character, TreeSet<String>> map, char key) {
		TreeSet<String> tree = map.get(key);
        if (tree == null)
        {
            System.out.println("The key is not in the dictionary");
        }
        return tree;
	}
	
	public static void removeAllKey(Map<Character, TreeSet<String>> map, char key) {
		if (map.containsKey(key))
        {
            map.remove(key);
            System.out.println("The key " + key + " removed successfully.");
        }
        else
        {
            System.out.println("The key " + key + " is not in the dictionary.");
        }
	}
	
	public static void removeWord(Map<Character, TreeSet<String>> map, String word) {
		
		char c = word.charAt(0);
		if(map.containsKey(c))
		{
			TreeSet<String> treeset = getWords(map, c);
			
			if(treeset.contains(word))
			{
				treeset.remove(word);
				System.out.println("Word '" + word + "' removed successfully.");
			}
			else
			{
				System.out.println("word not found");
			}
			
		}
		else
		{
			System.out.println("word not found");
		}
	}

	public static void search(Map<Character, TreeSet<String>> map, String substring) {
        boolean matchFound = false;
    
        for (Map.Entry<Character, TreeSet<String>> entry : map.entrySet()) {
            char key = entry.getKey();
            TreeSet<String> value = entry.getValue();
    
            for (String word : value) {
                if (word.contains(substring)) {
                    System.out.println("Match found in map '" + key + "': " + word);
                    matchFound = true;
                }
            }
        }
    
        if (!matchFound) {
            System.out.println("No match found in the dictionary.");
        }
    }
    
}