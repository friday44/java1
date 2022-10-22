package dz1;

public class task3 {
     public String reverseWords(String s) {

         String ans = new String();
         int start = 0;
         int end = s.length();

         while (start < end) {
             while (start < end && s.charAt(start) == ' ') {
                 start++;
             }
             if (start >= end) break;
             int tmp = start + 1;
             while (tmp < end && s.charAt(tmp) != ' ') {
                 tmp++;
            }
             String sub = s.substring(start, tmp);
             if (ans.length() == 0) ans = sub;
             else ans = sub + " " + ans;
             start = tmp + 1;
         }
         return ans;
     }
}

