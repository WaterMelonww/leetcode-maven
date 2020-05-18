package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 *
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2020-01-13 9:34
 */
public class Subsets {
    public static void main(String[] args) {
        int[] nums=new int[]{4,4,4,1,4};
        System.out.println(subsets(nums));
     }

    public static List<List<Integer>> subsets(int[] nums) {
        //大佬解法
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length==0){
            return result;
        }
        result.add(new ArrayList<>());
//        List<Integer> temp=new ArrayList<>();
//        for (int i=0;i<nums.length;i++){
//            temp.add(nums[i]);
//        }
//        Collections.sort(temp);
        for (int i=0;i<nums.length;i++){
            int size=result.size();
            for(int j=0;j<size;j++){
                List<Integer> list=result.get(j);
                List<Integer> templist=new ArrayList<>(list);
                templist.add(nums[i]);
//                templist.add(temp.get(i));
//                if(!result.contains(templist)){      //针对子集二
//                    result.add(templist);
//                }
            }
        }
        return result;
    }
}
