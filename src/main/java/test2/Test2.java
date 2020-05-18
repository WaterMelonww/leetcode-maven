package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * X^2+XY-Y^2+Z 要求算数结果最小值
 * @create 2020-04-21 22:03
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int[] num=new int[10];
            for(int i=0;i<10;i++){
                num[i]=sc.nextInt();
            }
            int[] bb=new int[]{512,0,512};
            for(int temp:num){
                getResult(bb,temp);
            }
            System.out.println(caclue(bb));
        }
    }

    private static void getResult(int[] bb, int temp) {
        int tag=-1;
        int start=caclue(bb);
        for(int i=0;i<3;i++){
            int[] tt=new int[3];
            System.arraycopy(bb,0,tt,0,3);
            tt[i]=temp;
            int next=caclue(tt);
            if(next<start){
                start=next;
                tag=i;
            }
        }
        if(tag>-1){
            bb[tag]=temp;
        }
    }

    private static int caclue(int[] bb) {
        return bb[0]*bb[0]+bb[1]*bb[0]-bb[1]*bb[1]+bb[2];
    }

}
