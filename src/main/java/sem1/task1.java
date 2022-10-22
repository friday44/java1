package sem1;
// 1281. Subtract the Product and Sum of Digits of an Integer

public class task1 {
       public int subtractProductAndSum(int n) {
            int prod = 1;
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                prod = prod * digit;
                sum = sum + digit;

                n /= 10;
            }
            return prod - sum;
       }
    }