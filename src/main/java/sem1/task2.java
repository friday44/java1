package sem1;
// 68.Given two binary strings a and b,
// return their sum as a binary string.
    public class task2 {
        public String addBinary(String a, String b) {
            if (a.length() < b.length()) {
                return addBinary(b, a);
            }
            int carry = 0;
            int j = b.length() - 1;
            StringBuilder sb = new StringBuilder();
            for (int i = a.length() - 1; i >= 0; i--) {
                if(a.charAt(i) == '1') {
                    carry += 1;
                }
                if (j >= 0 && b.charAt(j) == '1') {
                    carry += 1;
                }
                sb.append(carry % 2 );
                carry /= 2;
                j--;
            }
        if (carry == 1) {
            sb.append(carry % 2 );
        }
        return sb.reverse().toString();
    }
}
