package Strings;

public class CountNonAlphanumeric {
    public static void main(String[] args) {
        String str = "Dw746  !@# Hdjfj~234";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!(ch>='A' && ch<='Z')&&!(ch>='a' && ch<='z')&&!(ch>='0' && ch<='9')){
                count++;
            }
        }
        System.out.println(count);
    }
}
