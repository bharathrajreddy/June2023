package Strings;

import java.util.Scanner;

public class VowelsConsonantsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;  i<T; i++){
            String S = sc.next();
            int vowel =0;
            int consonant =0;
            for(int j=0; j<S.length(); j++){
                char ch = S.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }else{
                    consonant++;
                }
            }
            System.out.println(vowel+" "+consonant);
        }
    }
}
