package test2;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 输入一个算术表达式
 *
 * 输出描述:
 * 得到计算结果
 *
 * 示例1
 * 输入
 * 复制
 * 3+2*{1+2*[-4/(8-6)+7]}
 * 输出
 * 复制
 * 25
 * @create 2020-04-21 10:05
 */
public class SuanShu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(result(str));
        }
    }

    private static int result(String str) {
        Stack<Integer> num=new Stack<>();
        Stack<Character> chars=new Stack<>();
        String newStr=str.replaceAll("\\{","(")
                .replaceAll("}",")")
                .replaceAll("\\[","(")
                .replaceAll("]",")");
        System.out.println(newStr);
        String[] split = newStr.split("\\D+");
        System.out.println(String.join(" ",split));
        char[] array = newStr.toCharArray();
        for(int i=0;i<array.length;i++){
            if(array[i]>='0'&&array[i]<='9'){

            }
        }
        return 0;
    }
}
