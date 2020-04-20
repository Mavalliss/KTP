public class Palindrome {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(isPalindrome(s));
        }
    }

    public static String reverseString(String str) { // function that returns reverse String
        String res = "";
        char[] result = str.toCharArray();
        for (int i = result.length - 1; i >= 0; i--)
            res += result[i];
        return res;
    }

    public static boolean isPalindrome(String s) { // is String a palindrome or not
        return s.equals(reverseString(s));
    }
}