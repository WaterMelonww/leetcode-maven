package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 *
 * 输入描述:
 * 输入一个正浮点数值
 *
 * 输出描述:
 * 输出该数值的近似整数值
 *
 * 示例1
 * 输入
 * 复制
 * 5.5
 * 输出
 * 复制
 * 6
 * @create 2020-04-15 20:12
 */
public class ZhengXu7 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        double v = sc.nextDouble();
//        boolean flag=false;
//        String s=String.valueOf(v);
//        for(int i=0;i<s.length()-1;i++){
//            if (s.charAt(i)=='.'&&(Integer.valueOf(String.valueOf(s.charAt(i+1)))>=5)){
//                flag=true;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println(new Double(v+1).intValue());
//        }else {
//            System.out.println(new Double(v).intValue());
//        }
//    }
    //答案题解  强！！！
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double v = sc.nextDouble();
        int result=(int) v;
        if(v-result>=0.5 &&v-result<1){
            result++;
        }
        System.out.println(result);
    }
}
