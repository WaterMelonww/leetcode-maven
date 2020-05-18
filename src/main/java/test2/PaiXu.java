package test2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * Lily使用的图片包括"A"到"Z"、"a"到"z"、"0"到"9"。输入字母或数字个数不超过1024。
 *
 * 输出描述:
 * Lily的所有图片按照从小到大的顺序输出
 *
 * 示例1
 * 输入
 * 复制
 * Ihave1nose2hands10fingers
 * 输出
 * 复制
 * 0112Iaadeeefghhinnnorsssv
 * @create 2020-04-21 9:15
 */
public class PaiXu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String result = String.valueOf(chars);
            System.out.println(result);
        }
    }
}
