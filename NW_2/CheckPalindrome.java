package palindrome;

public class CheckPalindrome implements Palindrome{
    private int number1;
    private int reverse;

    @Override
    public boolean isPalindrome(int x) {
        number1=Math.abs(x);
        while (x != 0) {
                int remember = x % 10;
                reverse = reverse * 10 + remember;
                x = x / 10;
        }
        return number1 == Math.abs(reverse);

    }
}
