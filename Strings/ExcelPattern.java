/**
 * This program will print pattern like excel header
 * TODO -  this code is incorrect.
 * */

package Strings;

public class ExcelPattern {
    public static int excelPattern(int count){
        //if(count == 0) return 0;
        int start = 96;
        int end = 122;
        for( int i = 0;i <count;i++){
            for(int k = start;k<=end;k++){
                for (int j= 96;j<= 122 ;j++){
                    if(k == 96)
                        System.out.print((char)j+" ");
                    else
                        System.out.print((char)k+""+(char)j+" ");
                }
            }
            System.out.println();
        }
        //excelPattern(count - 1);
        return 0;
    }

    public static void main(String[] args) {
       // String str = "abcdefghijklmnopqrstuvwxyz";
        excelPattern(1);
    }
}
