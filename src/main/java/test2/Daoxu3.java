package test2;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。 如：输入“I am a student”，输出“tneduts a ma I”。
 *
 *
 *
 *
 *
 *
 * 输入参数：
 *
 * inputString：输入的字符串
 *
 *
 *
 *
 * 返回值：
 *
 * 输出转换好的逆序字符串
 *
 *
 * 输入描述:
 * 输入一个字符串，可以有空格
 *
 * 输出描述:
 * 输出逆序的字符串
 *
 * 示例1
 * 输入
 * 复制
 * I am a student
 * 输出
 * 复制
 * tneduts a ma I
 * @create 2020-04-16 11:31
 */
public class Daoxu3 {
    //方法一
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        StringBuffer sb=new StringBuffer(s);
//        System.out.println(sb.reverse());
//    }
    //方法二
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}
