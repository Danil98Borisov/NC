package palindrome;

public class CheckPalindrome implements Palindrome{
    private int reverse;

    @Override
    public boolean isPalindrome(int x) {
        int modulNumber=Math.abs(x);
        while (x != 0) {
                int remember = x % 10;
                reverse = reverse * 10 + remember;
                x = x / 10;
        }
        return modulNumber == Math.abs(reverse);

    }
}
