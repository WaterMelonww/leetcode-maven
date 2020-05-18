package test2;

import java.util.*;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 输入一个非空字符串
 *
 * 输出描述:
 * 输出第一个只出现一次的字符，如果不存在输出-1
 *
 * 示例1
 * 输入
 * 复制
 * asdfasdfo
 * 输出
 * 复制
 * o
 * @create 2020-04-18 16:51
 */
public class StringNum {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            String s = sc.nextLine();
//            Map<Character,Integer> map=new LinkedHashMap<>();
//            for(int i=0;i<s.length();i++){
//                char key=s.charAt(i);
//                if(map.containsKey(key)){
//                    map.put(key,map.get(key)+1);
//                }else {
//                    map.put(key,1);
//                }
//            }
//            char flag=' ';
//            for (Character temp:map.keySet()){
//                if(map.get(temp)==1){
//                    flag=temp;
//                    break;
//                }
//            }
//            if(flag==' '){
//                System.out.println(-1);
//            }else {
//                System.out.println(flag);
//            }
//        }
//    }


    //大佬写法：
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            char[] chars = str.toCharArray();
            String result="-1";
            for(int i=0;i<chars.length;i++){
                if(str.indexOf(chars[i])==str.lastIndexOf(chars[i])){
                    result=chars[i]+"";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
