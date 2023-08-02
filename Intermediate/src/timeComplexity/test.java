package timeComplexity;

public class test {
    public static void main(String[] args) {
        System.out.println(function(100));
    }
    public static int function(int n){
        while (n>0){
            n++;
            n -= 2;
        }
        return n;
    }
}
