package dz2;
// Given an integer n, return true if it is a power of two. Otherwise, return false.
//An integer n is a power of two, if there exists an integer x such that n == 2x.
public class task3 {
    public boolean isPowerOfTwo(int n) {
        if (n < 0) return false;
        if (n == 1) return true;
        if (n == 0) return false;
        if (n%2 != 0) return false;
        return isPowerOfTwo(n/2);
    }
}
