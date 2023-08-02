package Strings;

public class CharIndex {
    public static String solve(String A) {
        String res = "";
        for(int i=0; i<A.length(); i++){
            res = res+A.charAt(i);
            res= res+((int)(A.charAt(i))-96);
        }
        return res;
    }

    public static void main(String[] args) {
        String S = "Scaler";
//        System.out.println(solve(S));
        String s = S.toLowerCase();
        System.out.println(s);
    }
}
