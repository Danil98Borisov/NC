package palindrome;

public class Main {
    static CheckPalindrome checkPalindrome;

    public static void main (String[] args){
        checkPalindrome = new CheckPalindrome();

        System.out.format("Is it a palindrome? - %s \n Is it a palindrome? - %s ", checkPalindrome.isPalindrome(121),checkPalindrome.isPalindrome(454));
    }
}
