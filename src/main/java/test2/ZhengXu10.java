package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。
 *
 * 输入描述:
 * 输入N个字符，字符在ACSII码范围内。
 *
 * 输出描述:
 * 输出范围在(0~127)字符的个数。
 *
 * 示例1
 * 输入
 * 复制
 * abc
 * 输出
 * 复制
 * 3
 * @create 2020-04-15 21:58
 */
public class ZhengXu10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int result=0;
        char[] temp=new char[128];
        for(int i=0;i<s.length();i++){

            if(temp[s.charAt(i)]==0&&s.charAt(i)>0&&s.charAt(i)<127){
                temp[s.charAt(i)]++;
                result++;
            }
        }
        System.out.println(result);
    }
}
