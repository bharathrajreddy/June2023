package Strings;

public class LastOccurance {
    public static int solve(final String A, final int B) {
        int num =-1;
        for(int i=A.length()-1; i>=1; i--){
            char ch = A.charAt(i);
            if(ch==B){
                num = i;
                break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String str = "Bharath";
        System.out.println(solve(str, 97));
    }
}
