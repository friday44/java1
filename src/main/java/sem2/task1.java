package sem2;

public class task1 {
    // Найти все пути получения 10 из 3 с помощь. +2 и *2
    public static void main(String[] args) {
        findPath(1, 729, 2, 2, "");
    }
    // K1 - сложили
    // K2 - умножили
    public static void findPath(int source, int target, int addent, int multiplier, String path) {
        if (source > target) return;
        if (source == target) {
            System.out.println(path);
            return;
        }
        findPath(source * addent + 1, target, addent, multiplier, path + " K1");
        findPath(source * multiplier - 1, target, addent, multiplier, path + " K2");
    }
}

