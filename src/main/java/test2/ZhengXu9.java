package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 *
 * 输入描述:
 * 输入一个int型整数
 *
 * 输出描述:
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 *
 * 示例1
 * 输入
 * 复制
 * 9876673
 * 输出
 * 复制
 * 37689
 * @create 2020-04-15 20:13
 */
public class ZhengXu9 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num = sc.nextInt();
//        List<Integer> list=new ArrayList<>();
//        while (num>0){
//            if(!list.contains(num%10)){
//                list.add(num%10);
//            }
//            num=num/10;
//        }
//        StringBuffer sb=new StringBuffer();
//        for (Integer temp:list){
//          sb.append(temp);
//        }
//        System.out.println(Integer.valueOf(sb.toString()));
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int result=0;
        int[] temp=new int[10];
        while(num>0){
            if(temp[num%10]==0){
                temp[num%10]++;
                result=result*10+num%10;
            }
            num/=10;
        }
        System.out.println(result);
    }
}
