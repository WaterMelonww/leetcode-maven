package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入描述:
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 *
 * 输出描述:
 * 输出到长度为8的新字符串数组
 *
 * 示例1
 * 输入
 * 复制
 * abc
 * 123456789
 * 输出
 * 复制
 * abc00000
 * 12345678
 * 90000000
 * @create 2020-04-15 18:36
 */
public class ZhengXu4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            while (s.length()>8){
                String s1=s.substring(0,8);
                System.out.println(s1);
                s=s.substring(8);
            }
            StringBuffer sb=new StringBuffer(s);
            for (int i=0;i<8-s.length();i++){
                sb.append(0);
            }
            System.out.println(sb);
        }
    }
}
