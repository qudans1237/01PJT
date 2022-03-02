package test;

import java.util.ArrayList;
import java.util.List;

public class Prob19 {

    private static String[] stringSplit(String str1, String str2) {
        List<String> splitList = new ArrayList<String>();
        int splitIdx = 0;

        for(int i = 0; i < str1.length(); i++) {
            String curChar = String.valueOf(str1.charAt(i));

            if(curChar.equals(str2) || i == str1.length()-1) {
                splitList.add(str1.substring(splitIdx, i));
                splitIdx = i+1;
            }
        }

        String[] result = splitList.toArray(new String[splitList.size()]);

        return result;
    }
    
    public static void main(String[] args) {
        String str = "PROD-001#X-note#Samsung#3#6000000";
        String[] strs = stringSplit(str, "#");
        System.out.println("=== 문자열 처리 결과 ===");

        for(int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
}