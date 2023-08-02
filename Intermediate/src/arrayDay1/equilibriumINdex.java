package arrayDay1;

public class equilibriumINdex {
        public static int eqbmindex(int array[])
        {
            int n = array.length;
            int i, j;
            int lsum, rsum;
            for (i = 0; i < n; ++i)
            {
                lsum = 0;
                for (j = 0; j < i; j++)
                    lsum = lsum + array[j];
                rsum = 0;
                for (j = i + 1; j < n; j++)
                    rsum = rsum + array[j];
                if (lsum == rsum)
                    return i;
            }
            return -1;
        }
        public static void main(String args[])
        {
            int array[] = {-7, 1, 5, 2, -4, 3, 0};
            System.out.println(eqbmindex(array));
        }
}
