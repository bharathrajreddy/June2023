package Strings;

public class ReverseString {
    public static String reveseString(String str){
//        int n = str.length();
//        String S = "";
//        char[] ch = new char[n];
//        for(int i=0 ;i<=n-1; i++){
//            ch[i] = str.charAt(n-1-i);
//        }
//        S = ch.toString();
//        return S;

        //approach 1
//        String answer = "";
//        for(int i=str.length()-1; i>=0;i--){
//            answer = answer+str.charAt(i);
//        }
//        return answer;

        //approach 2
        String ans = "";
        for(int i=0; i<str.length();i++){
            ans = str.charAt(i)+ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reveseString(str));

    }
}
