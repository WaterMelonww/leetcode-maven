package test2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 *首先输入要输入的整数个数n，然后输入n个整数。输出为n个整数中负数的个数，和所有正整数的平均值，结果保留一位小数。
 *
 * 输入描述:
 * 首先输入一个正整数n，
 * 然后输入n个整数。
 *
 * 输出描述:
 * 输出负数的个数，和所有正整数的平均值。
 *
 * 示例1
 * 输入
 * 复制
 * 5
 * 1
 * 2
 * 3
 * 4
 * 5
 * 输出
 * 复制
 * 0 3
 * @create 2020-04-17 9:58
 */
public class Daoxu11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n =scanner.nextInt();
            int countf=0;
            int countz=0;
            float average=0;
            for (int i=0;i<n;i++){
                int num=scanner.nextInt();
                if(num>0){
                    countz++;
                    average=average+num;
                }else if(num<0){
                    countf++;
                }
            }
            System.out.print(countf+" ");
            if(countz==0){
                System.out.println("0.0");
            }else {
                float ave=average/countz;
//                System.out.println(average);
//                System.out.println(countz);
                System.out.println(String.format("%.1f",ave));
            }
        }
    }

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()) {
//            int N=sc.nextInt();
//            int[]arr=new int[N];
//
//            for(int i=0;i<N;i++) {
//                arr[i]=sc.nextInt();
//            }
//
//            int num1=0,num2=0;
//            double sum=0.0;
//            double aver=0.0;
//            for(int j=0;j<arr.length;j++) {
//                if(arr[j]<0) {
//                    num1++;
//                }
//                if(arr[j]>0) {
//                    sum=sum+arr[j];
//                    num2++;
//                }
//            }
//            aver=sum/num2;
//            System.out.print(num1+" ");
//            String result = String .format("%.1f",aver);
//            System.out.println(result);
//        }
//    }
}
