package functions;

public class FunctionExample {

    public static int addTwoNumbers(int num1, int num2){
        int sum = num1+num2;

        return sum;
    }
    public static String checkEvenOrOdd(int num){
        if(num%2==0){
            return "Even";
        }else
            return "Odd";
    }

    public static void fun(int num){
        System.out.println(num);
    }

    /*Q3*/public static double areaOfRectangle(double length, double breadth){
        double area = length * breadth;

        return area;
    }
    /*Q4*/public static int areaOfSquare(int rad){

        double area =   ((Math.PI)* rad*rad);
        return (int) Math.round(area);
    }

    public static double areaOfSquareDouble(int rad){

        double area =   ((Math.PI)* rad*rad);
        return Math.round(area);
    }

    public static void printPrimesTillN(int N){
        for(int i=1; i<=N; i++){
            int factor = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    factor++;
                }
            }
            if(factor==2){
                System.out.println(i+" ");
            }
        }
    }


    public static boolean isPrime(int n){
        int factor = 0;
        for(int i=1; i<=n; i++){

            if(n%i==0){
                factor++;
            }
        }
        if(factor==2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
//        System.out.println(addTwoNumbers(5,7));
//        System.out.println(checkEvenOrOdd(9));
//        System.out.println(areaOfRectangle(25, 35));
//        System.out.println(areaOfSquare(13));
//        System.out.println(areaOfSquareDouble(13));
        printPrimesTillN(10);
        for(int i=2; i<=7; i++){

        }
        System.out.println(isPrime(7));
    }
}
