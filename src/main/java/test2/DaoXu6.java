package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 题目描述
 *
 *    Redraiment是走梅花桩的高手。Redraiment总是起点不限，从前到后，往高的桩子走，但走的步数最多，不知道为什么？你能替Redraiment研究他最多走的步数吗？
 *
 * 样例输入
 *
 * 6
 *
 * 2 5 1 5 4 5
 *
 * 样例输出
 *
 * 3
 * Example:
 * 6个点的高度各为 2 5 1 5 4 5
 * 如从第1格开始走,最多为3步, 2 4 5
 * 从第2格开始走,最多只有1步,5
 * 而从第3格开始走最多有3步,1 4 5
 * 从第5格开始走最多有2步,4 5
 *
 * 所以这个结果是3。
 * @create 2020-04-16 14:24
 */
public class DaoXu6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int[] temp=new int[num];
            for(int i=0;i<num;i++){
                temp[i]=sc.nextInt();
            }
            getResult(num,temp);
        }
    }


    private static void getResult(int num,int[] input) {

       int dp[]=new int[num];
       for(int i=0;i<num;i++){
           dp[i]=1;
           for(int j=0;j<i;j++){
               if(input[j]<input[i]){
                   dp[i]=Math.max(dp[i],dp[j]+1);
               }
           }
       }
       int max=0;
       for(int i=0;i<dp.length;i++){
           if(dp[i]>max){
               max=dp[i];
           }
       }
        System.out.println(max);
    }
}
