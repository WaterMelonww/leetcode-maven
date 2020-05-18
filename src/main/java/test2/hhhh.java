package test2;

import java.util.Arrays;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * @create 2020-04-21 23:08
 */
public class hhhh {
    public static void main(String[] args) {

        String[] aa = new String[]{"A2", "B2", "C3", "a9", "d0"};
        quickSort(aa, 0, aa.length - 1);

        System.out.println(Arrays.toString(aa));
    }



    private static void quickSort(String[] aa,int left,int right)
    {
        int i, j, pivot;

        if (left > right)
        {
            return;
        }

        pivot = getValue(aa[left]);

        i = left;
        j = right;
        //快排排排排
        while (i != j)
        {

            while (getValue(aa[j]) <= pivot &&i < j)
            {
                j--;
            }


            while (getValue(aa[i]) >= pivot &&i < j)
            {
                i++;
            }


            if (i<j)
            {

                String temp = aa[i];
                aa[i] = aa[j];
                aa[j] = temp;
            }
        }

        //swap
        String tt = aa[left];
        aa[left] = aa[i];
        aa[i] = tt;
        //递归
        quickSort(aa,left, i - 1);
        quickSort(aa,i + 1, right);

    }

    private static int getValue(String var) {
        return var.charAt(var.length() - 1);
    }

}
