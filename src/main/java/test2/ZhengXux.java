package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 输入一行以空格来分隔的句子
 *
 * 输出描述:
 * 输出句子的逆序
 *
 * 示例1
 * 输入
 * 复制
 * I am a student
 * 输出
 * 复制
 * student a am I
 * @create 2020-04-18 15:07
 */
public class ZhengXux {
    public static void main(String[] srgs){
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        str= str.replaceAll("[^a-zA-Z]"," ");
        String[] strings = str.trim().split("\\s+");
        for(int i=strings.length-1;i >=0 ; i-- ){
            System.out.print(strings[i]);
            if(i !=0){
                System.out.print(" ");
            }
        }
    }
}
