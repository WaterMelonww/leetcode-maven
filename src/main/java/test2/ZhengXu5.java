package test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 *
 * 输入描述:
 * 输入一个十六进制的数值字符串。
 *
 * 输出描述:
 * 输出该数值的十进制字符串。
 *
 * 示例1
 * 输入
 * 复制
 * 0xA
 * 输出
 * 复制
 * 10
 * @create 2020-04-15 18:55
 */
public class ZhengXu5 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        Map<String,Integer> map=new HashMap<>();
//        map.put("A",10);
//        map.put("B",11);
//        map.put("C",12);
//        map.put("D",13);
//        map.put("E",14);
//        map.put("F",15);
//        while (sc.hasNext()){
//            String s = sc.next();
//            s=s.substring(2).intern();
//            int count=0;
//            for (int i=0;i<s.length();i++){
//                if(map.containsKey(String.valueOf(s.charAt(s.length()-1-i)))){
//                    count+=map.get(String.valueOf(s.charAt(s.length()-1-i)))*Math.pow(16,i);
//                }else {
//                    String s1 = String.valueOf(s.charAt(s.length() - 1 - i));
//                    count+=(Math.pow(16,i))*Integer.valueOf(s1);
//                }
//            }
//            System.out.println(count);
//        }
//    }

    //答案区参考==。
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String next = sc.next();
            next=next.substring(2);
            System.out.println(Integer.parseInt(next,16));
        }
    }
}
