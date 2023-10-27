package Recursion;

import java.util.ArrayList;

public class KeypadCombination {

    static String[] keypadCodes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"}; 

    public static ArrayList<String> keypadCombinaton(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String rstr = str.substring(1);
        ArrayList<String> restOfString = keypadCombinaton(rstr);

        String codeForCh = keypadCodes[ch - '0'];
        ArrayList<String> mres = new ArrayList<String>();
        for(int i=0; i< str.length(); i++){
            char c = codeForCh.charAt(i);
            for(String s : restOfString){
                mres.add(c + s);
            }
        }
        return mres;
    }

    public static void main(String[] args) {
        ArrayList<String> result = keypadCombinaton("678");
        System.out.println(result);
    }
    
}
