package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "lol";
        System.out.println(checkPalindrome(str));
    }
    public static boolean checkPalindrome(String str){

       String ans = reveseString(str);
        return str.equals(ans);
    }

    public static String reveseString(String str){
        String ans = "";
        for(int i=0; i<str.length();i++){
            ans = str.charAt(i)+ans;
        }
        return ans;
    }

}
