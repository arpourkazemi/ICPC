import java.util.HashMap;
import java.util.Scanner;

public class DoubleStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String[] ans = new String[t];
        for (int i = 0; i < t; i++) {
            ans[i] = "";
        }
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            String[] strings = new String[n];
            HashMap<String, Boolean> hashMap = new HashMap<>();
            for (int j = 0; j < n; j++) {
                strings[j] = input.next();
                hashMap.put(strings[j], true);
            }
            for (int j = 0; j < n; j++) {
                boolean found = false;
                if (strings[j].length() > 1){
                    for (int k = 1; k < strings[j].length(); k++) {
//                        System.out.println(strings[j].substring(0, k));
//                        System.out.println(strings[j].substring(k));
                        if (hashMap.containsKey(strings[j].substring(0, k)) && hashMap.containsKey(strings[j].substring(k))){
                            found = true;
                            break;
                        }
                    }
                }
                if (found) ans[i] += "1";
                else ans[i] += "0";
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
