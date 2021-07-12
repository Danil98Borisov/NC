package palindrome;

public class CheckPalindrome implements Palindrome {

    static private boolean ResultPal(int number) {
        int reverse=0;
        int modulNumber = Math.abs(number);
        while (number != 0) {
            int remember = number % 10;
            reverse = reverse * 10 + remember;
            number = number / 10;
        }
        return modulNumber == Math.abs(reverse);
    }

    @Override
    public boolean isPalindrome(int x) {
        return ResultPal(x);
    }

}

