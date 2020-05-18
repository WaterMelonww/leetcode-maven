package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 自守数是指一个数的平方的尾数等于该数自身的自然数。例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。请求出n以内的自守数的个数
 * 功能: 求出n以内的自守数的个数
 *
 *
 * 输入参数：
 * int n
 *
 * 返回值：
 * n以内自守数的数量。
 * @create 2020-04-17 9:10
 */
public class Daoxu10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int count=0;
            for(int i=0;i<=num;i++){
                String s1= String.valueOf(i*i);
                String s2 = String.valueOf(i);
                s1=s1.substring(s1.length()-s2.length());
                if(s1.equals(s2)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    //答案区 优化
    // public static void main(String[] args) {
    //        Scanner sc=new Scanner(System.in);
    //        while (sc.hasNext()){
    //            int num=sc.nextInt();
    //            int count=0;
    //            for(int i=0;i<=num;i++){
    //                String s1= String.valueOf(i*i);
    //                String s2 = String.valueOf(i);
    //                if(s1.endsWith(s2)){
    //                    count++;
    //                }
    //            }
    //            System.out.println(count);
    //        }
    //    }
}
