package palindrome;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {

    @Test
    void getPalindromeNegativeTrueNumber() {
       boolean currentResult = new CheckPalindrome().isPalindrome(-123454321);
         Assert.assertEquals(true,currentResult);

    }

    @Test
    void getPalindromeNegativeFalseNumber() {
        boolean currentResult = new CheckPalindrome().isPalindrome(-123454322);
        Assert.assertEquals(false,currentResult);

    }

    @Test
    void palindromeNormalTrueNumber() {
        boolean currentResult = new CheckPalindrome().isPalindrome(123454321);
        Assert.assertEquals(true,currentResult);

    }

    @Test
    void palindromeNormalFalseNumber() {
        boolean currentResult = new CheckPalindrome().isPalindrome(123454322);
        Assert.assertEquals(false,currentResult);

    }

    @Test
    void palindromeNullNumber() {
        boolean currentResult = new CheckPalindrome().isPalindrome(0);
        Assert.assertEquals(true,currentResult);

    }
}