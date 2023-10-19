package Strings;

public class LastWord {

    public static int lastWord(String str){
        String s = str.substring(str.lastIndexOf(' ') + 1);
        System.out.println(s);
        return s.length();
    }

    public  static void main(String args[]){
        String str = "hello world";
        int wordLength = lastWord(str);
        System.out.println(wordLength);
    }
    
}
