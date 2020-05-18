package test2;

import sun.applet.Main;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 描述：
 *
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 *
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *
 *
 * 输入描述:
 * 输入一个int整数
 *
 * 输出描述:
 * 将这个整数以字符串的形式逆序输出
 *
 * 示例1
 * 输入
 * 复制
 * 1516000
 * 输出
 * 复制
 * 0006151
 * @create 2020-04-16 8:49
 */
public class ZhengXu11 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        String s=String.valueOf(num);
//        Stack<Character> temp=new Stack<>();
//        StringBuffer sb=new StringBuffer();
//        for(int i=0;i<s.length();i++){
//            temp.push(s.charAt(i));
//        }
//        while (!temp.isEmpty()){
//            sb.append(temp.pop());
//        }
//        System.out.println(sb);
//    }

    //方法二
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        sb.reverse();
        System.out.println(sb);
    }
}
