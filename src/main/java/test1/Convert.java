package test1;

import java.util.Arrays;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 * 示例 1:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 *
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zigzag-conversion
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2020-04-24 10:24
 */
public class Convert {
    public static void main(String[] args) {
        String s="ABC";
        int numRows=2;
        System.out.println(convert(s,numRows));
    }

    //大佬解法
    private static String convert(String s, int numRows) {
        if(numRows<=1){
            return s;
        }
        char [] c = s.toCharArray();
        StringBuilder tmp = new StringBuilder();
        for(int i=0;i<numRows;i++){
            int j=i;
            boolean flag=true;
            while(j<=c.length-1){
                tmp.append(c[j]);
                if(i==0||i==numRows-1){
                    j=j+2*(numRows-1);
                }else{
                    if(flag){
                        j=j+2*(numRows-1-i);
                        flag=false;
                    }else{
                        j=j+2*i;
                        flag=true;
                    }
                }
            }
        }
        return tmp.toString();
    }

//    private static String convert(String s, int numRows) {
//        char[] chars = s.toCharArray();
//        if(numRows<=1){
//            return s;
//        }
//        int[][] temp=new int[numRows][s.length()];
//        int count=0;
//        int row=0;
//        int colum=0;
//        boolean falg=false;
//        while(count!=s.length()){
//            if(row<numRows&& !falg){
//                temp[row][colum]=chars[count];
//                row++;
//                count++;
//            }else if(row==numRows){
//                falg=true;
//                row=row-2;
//                colum++;
//                temp[row][colum]=chars[count];
//                count++;
//            }else if(row==0){
//                falg=false;
//                row++;
//                temp[row][colum]=chars[count];
//            }else {
//                row--;
//                colum++;
//                temp[row][colum]=chars[count];
//                count++;
//            }
//        }
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<numRows;i++){
//            for(int j=0;j<s.length();j++){
//                System.out.print((char)temp[i][j]+" ");
//                if(temp[i][j]!=0){
//                    sb.append((char)temp[i][j]);
//                }
//            }
//            System.out.println();
//        }
//        return sb.toString();
//    }

}
