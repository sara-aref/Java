

interface checkstringMain {

    boolean test(String word);
}

public class checkString{ 
    public static void main(String [] args) {

        checkstringMain checking = (n) -> isLetter(n);

        if(checking.test("Sara"))
        {
            System.out.println("the string is letters only.");
        }
        else
        {
            System.out.println("the string contains other than letters.");
        }
    }

    static boolean isLetter(String word) {
        // Using regular expression to check if the string contains only letters
        return word.matches("[a-zA-Z]+");
    }
}


