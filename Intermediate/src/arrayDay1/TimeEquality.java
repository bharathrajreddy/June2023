package arrayDay1;

public class TimeEquality {
    public static void main(String[] args) {
        int[] a = {2,4,1,3,2};
        System.out.println(solve(a));
    }
    public static int solve(int[] a){
        int count=0, max=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        for(int i=0; i<a.length; i++){
            if(max > a[i]){
                count = count +(max-a[i]);
            }
        }
        return count;
    }
}
