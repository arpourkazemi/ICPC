import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShoeShuffling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t  = input.nextInt();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            HashMap<Long,Integer> siCount = new HashMap<>();
            long[] si = new long[n];
            for (int j = 0; j < n; j++) {
                si[j] = input.nextInt();
                if (!siCount.containsKey(si[j])) siCount.put(si[j],1);
                else siCount.put(si[j], siCount.get(si[j]) +1);
            }
            boolean hasMultiple = true;
            for (int value: siCount.values()) {
                if (value == 1) {
                    hasMultiple = false;
                    break;
                }
            }
            ArrayList<Integer> temp = new ArrayList<>();
            if (!hasMultiple) temp.add(-1);
            else {
                for (int j = 0; j < n; j++) {
                    int lastIndex = j + 1;
                    while (lastIndex != n && si[lastIndex] == si[j]) lastIndex++;
                    temp.add(lastIndex);
                    for (int k = j + 1; k < lastIndex; k++) {
                        temp.add(k);
                    }
                    j = lastIndex - 1;
                }
            }
            ans.add(temp);
        }
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
