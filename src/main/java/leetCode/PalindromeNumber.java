package leetCode;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;

        int rev=0,n=x;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        return rev == n;
    }

}
