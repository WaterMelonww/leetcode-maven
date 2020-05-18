package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 *
 * 输入描述:
 *  输入一个整数（int类型）
 *
 * 输出描述:
 *  这个数转换成2进制后，输出1的个数
 *
 * 示例1
 * 输入
 * 复制
 * 5
 * 输出
 * 复制
 * 2
 * @create 2020-04-16 8:50
 */
public class ZhengXu15 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int count=0;
            while (num!=0){
                int bit=num%2;
                if(bit==1){
                    count++;
                }
                num=num/2;
            }
            System.out.println(count);
        }
    }
}
