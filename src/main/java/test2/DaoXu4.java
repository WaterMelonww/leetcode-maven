package test2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 输入任意个整数
 *
 * 输出描述:
 * 输出负数个数以及所有非负数的平均值
 *
 * 示例1
 * 输入
 * 复制
 * -13
 * -4
 * -7
 * 输出
 * 复制
 * 3
 * 0.0
 * @create 2020-04-16 12:41
 */
public class DaoXu4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();   //任意个整数  即 一行输入 自行划分
        String[] split = s.split("\\s+");
        double average=0;
        int countf=0;
        double countz=0;
        for (int i=0;i<split.length;i++){
         if(Integer.parseInt(split[i])>0){
             average+=Double.parseDouble(split[i]);
             countz++;
         }else {
             countf++;
         }
        }
        DecimalFormat df=new DecimalFormat("0.0");
        System.out.println(countf);
        if(countz==0){
            System.out.println(df.format(countz));
        }else {
            average=average/ countz;
            System.out.println(df.format(average));
        }
    }
}
