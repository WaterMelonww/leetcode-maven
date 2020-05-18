package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *  public static int getTotalCount(int monthCount)
 *     {
 *         return 0;
 *     }
 *  输入int型表示month
 *
 * 输出描述:
 * 输出兔子总数int型
 *
 * 示例1
 * 输入
 * 复制
 * 9
 * 输出
 * 复制
 * 34
 * @create 2020-04-21 9:40
 */
public class TuZi {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            int num=sc.nextInt();
//            System.out.println(getTotalCount(num));
//        }
//    }
//
//    private static int getTotalCount(int num) {
//        if(num==1||num==2){
//            return 1;
//        }
//        return getTotalCount(num-1)+getTotalCount(num-2);
//    }

    //其他思路（非递归）
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            System.out.println(getTotalCount(num));
        }
    }

    private static int getTotalCount(int num) {
        if(num==1||num==2){
            return 1;
        }
        int old=1;
        int young=1;
        int mounth1=1;
        int mounth2=0;
        for (int i=4;i<=num;i++){
            old+=mounth2;
            mounth2=mounth1;
            mounth1=old;
            young=mounth1+mounth2;
        }
        return old+young;
    }
}
