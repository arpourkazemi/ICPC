import java.util.HashMap;
import java.util.Scanner;

public class AandBandCompilationErrors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap<Long, Byte> first = new HashMap<>();
        HashMap<Long, Byte> second = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long num = input.nextLong();
            if (!first.containsKey(num)) first.put(num, (byte) 1);
            else first.put(num, (byte) (first.get(num) + 1));
        }
        for (int i = 0; i < n - 1; i++) {
            long num = input.nextLong();
            first.put(num, (byte) (first.get(num) - 1));
            if (!second.containsKey(num)) second.put(num, (byte) 1);
            else second.put(num, (byte) (second.get(num) + 1));
        }
        for (int i = 0; i < n - 2; i++) {
            long num = input.nextLong();
            second.put(num, (byte) (second.get(num) - 1));
        }
        for (long key : first.keySet()) {
            if (first.get(key) == 1) {
                System.out.println(key);
            }
        }
        for (long key : second.keySet()) {
            if (second.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}
