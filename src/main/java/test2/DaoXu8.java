package test2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 输入整型数组和排序标识，对其元素按照升序或降序进行排序（一组测试用例可能会有多组数据）
 *
 * 接口说明
 *
 * 原型：
 *
 * void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag);
 *
 * 输入参数：
 *
 * Integer[] pIntegerArray：整型数组
 *
 * int  iSortFlag：排序标识：0表示按升序，1表示按降序
 *
 * 输出参数：
 *
 * 无
 *
 * 返回值：
 *
 * void
 * 1、输入需要输入的整型数个数
 *
 * 输出描述:
 * 输出排好序的数字
 *
 * 示例1
 * 输入
 * 复制
 * 8
 * 1 2 4 9 3 55 64 25
 * 0
 * 输出
 * 复制
 * 1 2 3 4 9 25 55 64
 * @create 2020-04-16 16:42
 */
public class DaoXu8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int[] list=new int[num];
            for(int i=0;i<num;i++){
                list[i]=sc.nextInt();
            }
            int sort=sc.nextInt();
            sortIntegerArray(list,sort);
        }
    }

    private static void sortIntegerArray(int[] list, int sort) {
       // maopao(list);
        Arrays.sort(list);
        if(sort==0){
            for(int i=0;i<list.length;i++){
                System.out.print(list[i]+" ");
            }
        }else {
            for(int i=list.length-1;i>=0;i--){
                System.out.print(list[i]+" ");
            }
        }
        System.out.println();
    }

    private static void maopao(int[] list) {
        for (int i=0;i<list.length;i++){
            for(int j=0;j<list.length-1-i;j++){
                if(list[j]>=list[j+1]){
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
    }

//    private static void quicksort(int[] list, int start, int end) {
//        if(start>=end){
//            return;
//        }
//        int pre=swap(list,start,end);
//        quicksort(list,start,pre-1);
//        quicksort(list,pre+1,end);
//    }
//
//    private static int swap(int[] list, int start, int end) {
//        int flag=list[start];
//        int left=start;
//        int right=end;
//        while (right!=left){
//            while (right>left && list[right]>flag){
//                right--;
//            }
//            while(left<right&&list[left]<flag){
//                left++;
//            }
//            if(left<right){
//                int temp=list[left];
//                list[left]=list[right];
//                list[right]=temp;
//            }
//        }
//        int p=list[left];
//        list[left]=list[start];
//        list[start]=p;
//        return left;
//
//    }
}
