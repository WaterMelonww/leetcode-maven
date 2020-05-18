package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 输入一个字符串
 *
 * 输出描述:
 * 字符中所有出现的数字前后加上符号“*”，其他字符保持不变
 *
 * 示例1
 * 输入
 * 复制
 * Jkdi234klowe90a3
 * 输出
 * 复制
 * Jkdi*234*klowe*90*a*3*
 * @create 2020-04-17 10:47
 */
public class DaoXu12 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            String s = sc.nextLine();
//            StringBuilder sb=new StringBuilder();
//            for(int i=0;i<s.length()-1;i++){
//                if(s.charAt(i)<48||s.charAt(i)>57){
//                    sb.append(s.charAt(i));
//                    if(s.charAt(i+1)>=48&&s.charAt(i+1)<=57){
//                        sb.append("*");
//                    }
//                }else {
//                    if(s.charAt(i+1)>=48&&s.charAt(i+1)<=57){
//                        if(sb.length()==0){
//                            sb.append("*");
//                        }
//                        sb.append(s.charAt(i));
//                        continue;
//                    }else {
//                        if(sb.length()==0){
//                            sb.append("*");
//                        }
//                        sb.append(s.charAt(i));
//                        sb.append("*");
//                    }
//                }
//            }
//            if(s.charAt(s.length()-1)>=48&&s.charAt(s.length()-1)<=58){
//                sb.append(s.charAt(s.length()-1));
//                sb.append("*");
//            }else {
//                sb.append(s.charAt(s.length()-1));
//            }
//            System.out.println(sb.toString());
//        }
//    }



    //大佬写法
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String line = sc.nextLine();
            line=line.replaceAll("(\\d+)","\\*$1\\*");
            System.out.println(line);
        }
    }
}
