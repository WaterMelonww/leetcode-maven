package test2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 题目描述
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 *
 * 输入：
 *
 * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 *
 * 坐标之间以;分隔。
 *
 * 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
 *
 * 下面是一个简单的例子 如：
 *
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 *
 * 处理过程：
 *
 * 起点（0,0）
 *
 * +   A10   =  （-10,0）
 *
 * +   S20   =  (-10,-20)
 *
 * +   W10  =  (-10,-10)
 *
 * +   D30  =  (20,-10)
 *
 * +   x    =  无效
 *
 * +   A1A   =  无效
 *
 * +   B10A11   =  无效
 *
 * +  一个空 不影响
 *
 * +   A10  =  (10,-10)
 *
 * 结果 （10， -10）
 * @create 2020-04-17 14:38
 */
public class ZhengXu17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String[] split = s.split(";");
            int x=0;
            int y=0;
            for(int i=0;i<split.length;i++){
                if(split[i].matches("^[A,D,W,S](\\d+)")){
                    int num = Integer.parseInt(split[i].substring(1));
                    switch (split[i].charAt(0)){
                       case 'A':
                           x-=num;
                           break;
                       case 'D':
                           x+=num;
                           break;
                       case 'W':
                           y+=num;
                           break;
                       case 'S':
                           y-=num;
                           break;
                       default:
                           break;
                   }
                }
            }
            System.out.println(x+","+y);
        }
    }
}
