import java.util.HashSet;
import java.util.Set;

public class UniqueLengthPalindromicSubsequence 

    public static void helper(String s, String input, int indx, Set<String> set){
        if(input.length()>3) return;

        if(input.length()==3){
            if(input.charAt(0)==input.charAt(2)){
                set.add(input);
            }
            return;
        }

        if(indx==s.length()) return;

        helper(s,input+s.charAt(indx),indx+1,set);
        helper(s,input,indx+1,set);
    }
    public static int countPalindromicSubsequence(String s) {
        Set<String> set = new HashSet<>();
        helper(s,"",0,set);
        return set.size();
    }

    public static void main(String[] args) {
        String s = "aabca";
        int result = countPalindromicSubsequence(s);
        System.out.println(result);  // Expected output: 3 (aaa, aba, aca)
    }

