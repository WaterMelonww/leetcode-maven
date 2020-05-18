package test2;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 *  优先级相同即为出栈顺序
 * @create 2020-04-21 21:40
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] split = str.split(",");
            String[] result=new String[split.length];
            for(int i=0;i<split.length;i++){
                StringBuilder sb=new StringBuilder(split[i]);
                sb.reverse();
                result[i]=sb.toString();
            }
            //排序
            for(int i=0;i<result.length-1;i++){
               for(int j=0;j<result.length-1-i;j++){
                   if(result[j].charAt(0)<result[j+1].charAt(0)){
                       String temp=result[j];
                       result[j]=result[j+1];
                       result[j+1]=temp;
                   }
               }
            }

            for(int i=0;i<result.length;i++){
                StringBuilder sb=new StringBuilder(result[i]);
                sb.reverse();
                result[i]=sb.toString();
            }
            System.out.println(String.join(",",result));
        }
    }
}
