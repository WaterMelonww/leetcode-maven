package test1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2020-04-24 15:19
 */
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] num1={1,2};
        int[] num2={3,4};
        System.out.println(findMedianSortedArrays(num1,num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newNum=new int[nums1.length+nums2.length];
        int a=0,b=0,c=0;
        while(a<nums1.length&&b<nums2.length){
            if(nums1[a]<nums2[b]){
                newNum[c]=nums1[a];
                a++;
            }else {
                newNum[c]=nums2[b];
                b++;
            }
            c++;
        }
        while (a<nums1.length){
            newNum[c]=nums1[a];
            a++;
            c++;
        }
        while (b<nums2.length){
            newNum[c]=nums2[b];
            b++;
            c++;
        }
        if(newNum.length%2==0){
            return (newNum[newNum.length/2]+newNum[newNum.length/2-1])/2.0;
        }else {
            return newNum[newNum.length/2];
        }
    }
}
