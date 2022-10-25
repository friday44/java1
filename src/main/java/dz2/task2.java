package dz2;
// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
public class task2 {
    public double myPow(double x, int n) {
        if (n > 0) {
            return pow(x, n);
        }
        else {
            return 1.0 / pow(x, n);
        }
    }

    public static double pow (double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (x == 1) return x;
        if (x == 0 && n == 1 ) return 1;

        double half = pow(x, n/2);
        if (n % 2 == 0) {
            return half * half;
        }
        else {
            return half * half * x;
        }
    }
}
