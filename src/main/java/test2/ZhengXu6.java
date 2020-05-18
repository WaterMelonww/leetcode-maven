package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（如180的质因子为2 2 3 3 5 ）
 *
 * 最后一个数后面也要有空格
 *
 * 详细描述：
 *
 *
 * 函数接口说明：
 *
 * public String getResult(long ulDataInput)
 *
 * 输入参数：
 *
 * long ulDataInput：输入的正整数
 *
 * 返回值：
 *
 * String
 *
 *
 *
 * 输入描述:
 * 输入一个long型整数
 *
 * 输出描述:
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 *
 * 示例1
 * 输入
 * 复制
 * 180
 * 输出
 * 复制
 * 2 2 3 3 5
 * @create 2020-04-15 19:55
 */
public class ZhengXu6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long l = sc.nextLong();
        System.out.println(getResult(l));
    }
    public static String getResult(long l){
        StringBuffer sb=new StringBuffer();
        int i=2;
        while (i*i<=l){
            if(l%i==0){
                l/=i;
                sb.append(i+" ");
                i=1;
            }
            i++;
        }
        sb.append(l+" ");
        return sb.toString();
    }
}
