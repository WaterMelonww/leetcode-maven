package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 *
 * 输入描述:
 * 第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 *
 * 输出描述:
 * 输出输入字符串中含有该字符的个数。
 *
 * 示例1
 * 输入
 *
 * ABCDEF
 * A
 * 输出
 *
 * 1
 * @create 2020-04-15 17:02
 */
public class ZhengXu2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.next();
        System.out.println(test(s1,s2));
    }
    public static int test(String s1, String s2){
        int count=0;
        for (int i=0;i<s1.length();i++){
            if(String.valueOf(s1.charAt(i)).toLowerCase().equals(s2.toLowerCase())){
                count++;
            }
        }
        return count;
    }
}
