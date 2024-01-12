interface checkstringMain {

    boolean test(String word1, String word2);
}

public class betterString{ 
    public static void main(String [] args) {

        checkstringMain checking = (n1, n2) -> isBetter(n1, n2);

        if(checking.test("Hassan","Sara"))
        {
            System.out.println("the first string is better.");
        }
        else
        {
            System.out.println("the second string is better.");
        }
    }

    static boolean isBetter(String word1, String word2) {
        if(word1.length() > word2.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

