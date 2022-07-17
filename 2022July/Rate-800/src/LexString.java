import java.util.*;

public class LexString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String[] answer = new String[t];
        for (int i = 0; i < t; i++) {
            answer[i] = "";
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            String aa = input.next();
            String bb = input.next();
            char[] A = aa.toCharArray();
            char[] B = bb.toCharArray();
            Arrays.sort(A);
            Arrays.sort(B);
            ArrayList<Character> a = new ArrayList<>();
            ArrayList<Character> b = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                a.add(A[j]);
            }
            for (int j = 0; j < m; j++) {
                b.add(B[j]);
            }
            boolean turn = (a.get(0) < b.get(0));
            while (a.size() != 0 && b.size() != 0){
                if (turn){
                    if (a.get(0) > b.get(0)) {
                        answer[i] += a.get(0);
                        a.remove(0);
                    }else {
                        int tmp = k;
                        while (a.get(0) < b.get(0)){
                            answer[i] += a.get(0);
                            a.remove(0);
                            tmp--;
                            if (tmp == 0 || a.size() == 0 || b.size() == 0) break;
                        }
                    }
                } else {
                    if (b.get(0) > a.get(0)) {
                        answer[i] += b.get(0);
                        b.remove(0);
                    }else {
                        int tmp = k;
                        while (b.get(0) < a.get(0)){
                            answer[i] += b.get(0);
                            b.remove(0);
                            tmp--;
                            if (tmp == 0 || a.size() == 0 || b.size() == 0) break;
                        }
                    }
                }
                turn = !turn;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(answer[i]);
        }
    }
}
