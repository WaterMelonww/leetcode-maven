package test2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * •计算一个数字的立方根，不使用库函数
 *
 * 详细描述：
 *
 * •接口说明
 *
 * 原型：
 *
 * public static double getCubeRoot(double input)
 *
 * 输入:double 待求解参数
 *
 * 返回值:double  输入参数的立方根，保留一位小数
 *
 *
 * 输入描述:
 * 待求解参数 double类型
 *
 * 输出描述:
 * 输入参数的立方根 也是double类型
 *
 * 示例1
 * 输入
 * 复制
 * 216
 * 输出
 * 复制
 * 6.0
 * @create 2020-04-16 10:25
 */
public class DaoXu2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double v = sc.nextDouble();
        NumberFormat nf=new DecimalFormat("0.0");
        v=Double.parseDouble(nf.format(getCubeRoot(v)));
        System.out.println(v);
    }

    public static double getCubeRoot(double input){
        if(input==0){
            return input;
        }
        double x0=input;
        double x1;
        x1=(2*x0+input/x0/x0)/3;
        while (Math.abs(x1-x0)>0.000001){
            x0=x1;
            x1=(2*x0+input/x0/x0)/3;
        }
        return x1;
    }
}
