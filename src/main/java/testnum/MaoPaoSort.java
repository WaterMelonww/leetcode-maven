package testnum;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * @create 2020-04-28 13:18
 */
public class MaoPaoSort {
    public static void main(String[] args) {
        int[] num=new int[]{1,3,23,67,7,1,5,21};
        mPsort(num);
    }

    private static void mPsort(int[] num) {
        for(int i=0;i<num.length-1;i++){
            boolean flag=true;
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }

        for(int t:num){
            System.out.print(t+ " ");
        }
        System.out.println(System.currentTimeMillis());
    }
}
