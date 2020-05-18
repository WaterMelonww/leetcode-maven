package testnum;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * @create 2020-04-27 14:24
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] num=new int[]{1,1,23,67,7,1,5,21};
        quickSort(num,0,num.length-1);
        for(int t:num){
            System.out.print(t+" ");
        }
        System.out.println();
    }

    private static void quickSort(int[] num, int low, int high) {
        if(low<high){
            int flag=partition(num,low,high);
            quickSort(num,low,flag-1);
            quickSort(num,flag+1,high);
        }
    }

    private static int partition(int[] num,int left,int right) {
        int temp=num[left];
        while(left<right){
            while (left<right&&num[right]>=temp){
                right--;
            }
            num[left]=num[right];
            while (left<right&&num[left]<=temp){
                left++;
            }
            num[right]=num[left];
        }
        num[left]=temp;
        return left;
    }

}
