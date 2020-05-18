package test2;


import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 *
 * 输入描述:
 * 输入两个正整数A和B。
 *
 * 输出描述:
 * 输出A和B的最小公倍数。
 *
 * 示例1
 * 输入
 * 复制
 * 5 7
 * 输出
 * 复制
 * 35
 * @create 2020-04-16 9:47
 */
public class DaoXu1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int min=x>y?y:x;
        for(int i=min;i>=1;i--){
            if (x%i==0&&y%i==0){
                int result=i*(x/i)*(y/i);
                System.out.println(result);
                break;
            }
        }
    }
}
