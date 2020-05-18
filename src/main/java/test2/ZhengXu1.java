package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * 输入描述:
 * 一行字符串，非空，长度小于5000。
 *
 * 输出描述:
 * 整数N，最后一个单词的长度。
 *
 * 示例1
 * 输入
 *
 * hello world
 * 输出
 *
 * 5
 * @create 2020-04-15 16:38
 */
public class ZhengXu1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(test(s));
    }
    public static int test(String s){
        String[] s1 = s.split("\\s+");
        int count=s1[s1.length-1].length();
        return count;
    }
}
