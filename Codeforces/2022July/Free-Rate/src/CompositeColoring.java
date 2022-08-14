import java.util.*;

public class CompositeColoring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[][] nums = new int[t][];
        int[][] ans = new int[t][];
        int[] m = new int[t];
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            nums[i] = new int[n];
            ans[i] = new int[n];
            for (int j = 0; j < n; j++) {
                nums[i][j] = input.nextInt();
                if (nums[i][j] > maximum) maximum = nums[i][j];
            }
        }
        ArrayList<Integer>[] divisors = new ArrayList[maximum + 1];
        for (int i = 0; i < maximum + 1; i++) {
            divisors[i] = new ArrayList<>();
        }
        boolean[] isComposite = new boolean[maximum + 1];
        isComposite[2] = false;
        for (int i = 2; i < maximum + 1; i++) {
            if (!isComposite[i]){
                for (int j = i + 1; j < maximum + 1; j++) {
                    if (j % i == 0){
                        divisors[j].add(i);
                        isComposite[j] = true;
                    }
                }
            }
        }

//        ArrayList<Integer> primes = new ArrayList<>();
//        for (int i = 2; i < max_n + 1; i++) {
//            if (!isComposite[i]) primes.add(i);
//        }


        for (int i = 0; i < t; i++) {
            int listLength = 0;
            ArrayList<Integer>[] colorList = new ArrayList[11];

            colorList[listLength] = new ArrayList<>();
            colorList[listLength].add(nums[i][listLength]);
            listLength++;
            ans[i][0] = listLength;

            for (int j = 1; j < nums[i].length; j++) {
                int length = listLength;
                boolean foundWithNullIntersection = false;
                for (int k = 0; k < length; k++) {
                    foundWithNullIntersection = false;
                    for (int l = 0; l < colorList[k].size(); l++) {
                        if (intersection(divisors[nums[i][j]], divisors[colorList[k].get(l)]).size() == 0) {
                            foundWithNullIntersection = true;
                            break;
                        }
                    }
                    if (!foundWithNullIntersection) {
                        length = k;
                        break;
                    }
                }
                if (foundWithNullIntersection) {
                    colorList[listLength] = new ArrayList<>();
                    colorList[listLength].add(nums[i][j]);
                    listLength++;
                    ans[i][j] = listLength;
                } else {
                    ans[i][j] = length + 1;
                    colorList[length].add(nums[i][j]);
                }
            }
            m[i] = listLength;
        }


        for (int i = 0; i < t; i++) {
            System.out.println(m[i]);
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static  <T> List<T> union(List<T> list1, List<T> list2) {
        Set<T> set = new HashSet<T>();

        set.addAll(list1);
        set.addAll(list2);

        return new ArrayList<T>(set);
    }

    public static <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<T>();

        for (T t : list1) {
            if(list2.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }
}
