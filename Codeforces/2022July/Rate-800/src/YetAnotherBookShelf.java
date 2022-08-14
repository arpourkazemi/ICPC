import java.util.Scanner;

public class YetAnotherBookShelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] ans = new int[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            boolean[] isBook = new boolean[n];
            int lastBook = -1;
            int numOfBooks = 0;
            for (int j = 0; j < n; j++) if (input.nextInt() == 1) {
                isBook[j] = true;
                numOfBooks++;
                lastBook = j;
            }
            int tmp = 1;
            while (tmp < numOfBooks){
                lastBook--;
                if (isBook[lastBook]) tmp++;
                else ans[i]++;
            }

        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
