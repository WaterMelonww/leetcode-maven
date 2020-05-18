package test2;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 *
 * 输入描述:
 * 输入N个字符
 *
 * 输出描述:
 * 输出该字符串反转后的字符串
 *
 * 示例1
 * 输入
 * 复制
 * abcd
 * 输出
 * 复制
 * dcba
 * @create 2020-04-16 8:49
 */


//等价于Daoxu3
public class ZhengXu12 {
    //方法一
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s1=sc.nextLine();
//        Stack<Character> temp=new Stack<>();
//        StringBuffer sb=new StringBuffer();
//        for(int i=0;i<s1.length();i++){
//            temp.push(s1.charAt(i));
//        }
//        while (!temp.isEmpty()){
//            sb.append(temp.pop());
//        }
//        System.out.println(sb);
//    }
    //方法二
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        char[] chars = s.toCharArray();
//        for (int i=0;i<chars.length/2;i++){
//            char temp=' ';
//            temp=chars[i];
//            chars[i]=chars[chars.length-1-i];
//            chars[chars.length-1-i]=temp;
//        }
//        System.out.println(String.valueOf(chars));
//    }
    //方法三
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}
