package sem2;

import java.util.Scanner;

public class task2 {
    static void hanoi(int n, char start, char mid, char end) {
        if (n == 1) {
            System.out.println(n + " с " + start + " на " + end);
            return;
        }
        hanoi(n - 1, start, end, mid);
        System.out.println(n + " с " + start + " на " + end);
        hanoi(n - 1, mid, start, end);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько колец?");
        int n = sc.nextInt();
        sc.close();
        hanoi(n, 'A', 'B', 'C');
    }
}

