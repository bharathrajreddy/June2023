package Strings;

public class DiverseCharacters {
    public static int solve(final String A) {
        int num=0;
        int alphaCount=0;
        int numCount=0;
        for(int i=0; i<A.length(); i++){

            char ch = A.charAt(i);
            if((ch>='A' && ch<='Z')||ch>='a' && ch<='z'){
                alphaCount++;
            }
            if(ch>=0 && ch<=9){
                numCount++;
            }
        }
        num = Math.max(alphaCount, numCount);
        return num;
    }

    public static void main(String[] args) {
        String str = "String1234";
        System.out.println(solve(str));
        int num = str.indexOf('a');
    }
}
