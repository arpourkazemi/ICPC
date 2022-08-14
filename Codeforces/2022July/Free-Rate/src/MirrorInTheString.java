import java.util.Scanner;

public class MirrorInTheString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String[] answer = new String[t];
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            String s = input.next();
            String firstSubStr = s.substring(0,1);
            firstSubStr = firstSubStr + reverse(firstSubStr);
            for (int j = 1; j < n; j++) {
                String secondSubStr = s.substring(0,j + 1);
                secondSubStr = secondSubStr + reverse(secondSubStr);
                if (isValid(firstSubStr, secondSubStr)) answer[i] = firstSubStr;
                else firstSubStr = secondSubStr;
            }
            if (answer[i] == null) answer[i] = s + reverse(s);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(answer[i]);
        }
    }

    public static boolean isValid(String first, String second){
        if (second.startsWith(first)) return true;
        char firstChar = first.charAt(first.length() / 2);
        for (int i = first.length()/2; i < first.length(); i++) {
            char secondChar = second.charAt(i);
            if (firstChar == secondChar) firstChar = secondChar;
            else return secondChar > firstChar;
        }
        return false;
    }

    public static String reverse(String s){
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
