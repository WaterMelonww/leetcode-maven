package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 连续输入字符串(输出次数为N, 字符串长度小于100)，请按长度为8拆分每个字符串后输出到新的字符串数组，
 *
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 *
 * 首先输入一个整数，为要输入的字符串个数。
 *
 * 例如：
 *
 * 输入：2
 *
 *       abc
 *
 *       12345789
 *
 * 输出：abc00000
 *
 *       12345678
 *
 *       90000000
 * @create 2020-04-16 13:29
 */
public class DaoXu5 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            int n=Integer.parseInt(sc.nextLine());
//            for(int i=0;i<n;i++){
//                String s=sc.nextLine();
//                strSplit(s);
//            }
//        }
//    }
//
//    private static void strSplit(String s) {
//        if(s==null){
//            return;
//        }
//        int temp=s.length()%8;
//        StringBuffer sb=new StringBuffer(s);
//        if(temp!=0){
//            for (int i=8-temp;i>0;i--){
//                sb.append(0);
//            }
//        }
//        s=sb.toString();
//        for(int i=0;i<s.length();i+=8){
//            System.out.println(sb.substring(i,i+8));
//        }
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=Integer.parseInt(sc.nextLine());
            for(int i=0;i<n;i++){
                String s=sc.nextLine();
                strSplit(s);
            }
        }
    }

    private static void strSplit(String s) {
        if(s==null){
            return;
        }
        while (s.length()>8){
            String s1=s.substring(0,8);
            System.out.println(s1);
            s=s.substring(8);
        }
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<8-s.length();i++){
            sb.append("0");
        }
        System.out.println(sb);
    }
}
