package Recursion;

import java.util.ArrayList;

public class GetSubSequence {
    public static ArrayList<String> getSubSequences(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getSubSequences(ros);

        ArrayList<String> mres = new ArrayList<String>();
        for(String rstr : rres){
            mres.add("" + rstr);
            mres.add(ch + rstr);
        }
        return mres;
    }
    public static void main(String[] args) {
        ArrayList<String> arr = getSubSequences("abc");
        System.out.println(arr);
    } 
}
