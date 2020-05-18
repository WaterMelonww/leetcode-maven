package test2;


import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 *
 * 将一个英文语句以单词为单位逆序排放。
 *
 * 输出描述:
 * 得到逆序的句子
 *
 * 示例1
 * 输入
 * 复制
 * I am a boy
 * 输出
 * 复制
 * boy a am I
 * @create 2020-04-16 8:50
 */
public class ZhengXu13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split("\\s+");
        for(int i=0;i<split.length/2;i++){
            String temp=split[i];
            split[i]=split[split.length-1-i];
            split[split.length-1-i]=temp;
        }
        System.out.println(String.join(" ",split));
    }
}
