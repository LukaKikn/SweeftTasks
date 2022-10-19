public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Given String is Palindrome: " + isPalindrome("ABBA"));
        System.out.println("Given String is Palindrome: " + isPalindrome("ABAB"));
    }

    private static Boolean isPalindrome(String text){
        String reverse = reverse(text);
        return text.equals(reverse);
    }
    private static String reverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }

}
