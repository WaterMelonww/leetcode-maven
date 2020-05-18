package testnum;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * @create 2020-04-28 13:32
 */
public class XuanZeSort {
    public static void main(String[] args) {
        int[] num=new int[]{1,1,23,67,7,1,5,21};
        xuanzeSort(num);
    }

    private static void xuanzeSort(int[] num) {
        for(int i=0;i<num.length-1;i++){
            int min=i;
            for(int j=i+1;j<num.length;j++){
                if(num[j]<num[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=num[min];
                num[min]=num[i];
                num[i]=temp;
            }
        }

        for(int t:num){
            System.out.print(t+" ");
        }
    }

}
