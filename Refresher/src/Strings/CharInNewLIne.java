package Strings;

public class CharInNewLIne {
    public static void main(String[] args) {
//        String str = "India";
//        for(int i=0; i<str.length(); i++){
//            System.out.println((int)str.charAt(i));
//        }

//        System.out.println((int)str.charAt(i));

        String str1 = "DS2334Jfddkp";
        char A = 'A';
        char Z= 'Z';
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)>A &&str1.charAt(i)<Z){
                System.out.println(str1.charAt(i));
            }
        }
    }
}
