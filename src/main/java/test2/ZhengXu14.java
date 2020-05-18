package test2;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * 输入描述:
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述:
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 * 示例1
 * 输入
 * 复制
 * 9
 * cap
 * to
 * cat
 * card
 * two
 * too
 * up
 * boat
 * boot
 * 输出
 * 复制
 * boat
 * boot
 * cap
 * card
 * cat
 * to
 * too
 * two
 * up
 * @create 2020-04-16 8:50
 */
public class ZhengXu14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            String[] src=new String[num];
           for(int i=0;i<num;i++){
               src[i]=sc.next();
           }
            Arrays.sort(src);
            for(int i=0;i<num;i++){
                System.out.println(src[i]);
            }
        }
    }
}
