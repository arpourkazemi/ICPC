import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SortZero {
    public static int tmp;
    public static int[] nums;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            tmp = 0;
            int n = input.nextInt();
            if (n == 1) {
                input.nextInt();
                ans[i] = 0;
                continue;
            }
            nums = new int[n];
            HashMap<Integer, ArrayList<Integer>> indexOf = new HashMap<>();
            for (int j = 0; j < n; j++) {
                nums[j] = input.nextInt();
                if (!indexOf.containsKey(nums[j])) indexOf.put(nums[j], new ArrayList<>());
                indexOf.get(nums[j]).add(j);
            }
            int max = nums[n - 1];
            check(indexOf, n - 2, max);
            ans[i] = tmp;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
    public static void zeroAllBefore(HashMap<Integer, ArrayList<Integer>> indexOf, int index) {
        ArrayList<Integer> indexes = indexOf.get(nums[index]);
        if (indexes.get(indexes.size() - 1) > index) zeroAllBefore(indexOf, indexes.get(indexes.size() - 1));
        else {
            tmp++;
            for (Integer integer : indexes) {
                nums[integer] = 0;
            }
            check(indexOf, indexes.get(indexes.size() - 1), 0);
        }
    }
    public static void check(HashMap<Integer, ArrayList<Integer>> indexOf, int index, int max) {
        for (int j = index; j > -1; j--) {
            if (nums[j] > max) {
                zeroAllBefore(indexOf, j);
                return;
            } else max = nums[j];
        }
    }
}
