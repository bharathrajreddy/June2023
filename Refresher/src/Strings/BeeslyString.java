package Strings;

public class BeeslyString {
    public static void main(String[] args) {
        String S = "pampampam";
        System.out.println(solve(S));
    }
    public static int solve(String S){
        int n = S.length();
        int countM = 0, countPA = 0;
        for(int i=0; i<n; i++){
            if(S.charAt(i)=='m'){
                countM++;
            } else if (S.charAt(i)=='p' || S.charAt(i)=='a') {
                countPA++;
            }
        }
        if(countM==countPA){
            return 1;
        }else{
            return 0;
        }
    }
}
