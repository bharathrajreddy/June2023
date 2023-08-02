package Strings;

public class PasswordStrength {
    //low -- if only alphabet and less than 8 length
    //med = length >=8 and alphanumeric
    //high = length>=8 alphanumeric and special Symbol
    public static String passwordStrength(String str){
        int countAlphabet=0, countNumeric=0, countSpecial=0;
        if(str.length()<8){
            return "low";
        }
        for(int i=0;i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                countAlphabet++;
            } else if (ch>='a'&&ch<='z') {
                countAlphabet++;
            } else if (ch>='0'&&ch<='9') {
                countNumeric++;
            }else{
                countSpecial++;
            }
        }

        if(countAlphabet>0 && countNumeric>0 && countSpecial>0){
            return "high";
        } else if (countAlphabet>0 && countNumeric>0) {
            return "medium";
        }else{
            return "low";
        }

    }
    public static void main(String[] args) {
        String str = "1amBharath";
        System.out.println(passwordStrength(str));
    }
}
