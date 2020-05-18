package test1;

import java.util.*;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 *
 * 在一组 N 个人（编号为 0, 1, 2, ..., N-1）中，每个人都有不同数目的钱，以及不同程度的安静（quietness）。
 *
 * 为了方便起见，我们将编号为 x 的人简称为 "person x "。
 *
 * 如果能够肯定 person x 比 person y 更有钱的话，我们会说 richer[i] = [x, y] 。注意 richer 可能只是有效观察的一个子集。
 *
 * 另外，如果 person x 的安静程度为 q ，我们会说 quiet[x] = q 。
 *
 * 现在，返回答案 answer ，其中 answer[x] = y 的前提是，在所有拥有的钱不少于 person x 的人中，person y 是最安静的人（也就是安静值 quiet[y] 最小的人）。
 *
 * 示例：
 *
 * 输入：richer = [[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]], quiet = [3,2,5,4,6,1,7,0]
 * 输出：[5,5,2,5,4,5,6,7]
 * 解释：
 * answer[0] = 5，
 * person 5 比 person 3 有更多的钱，person 3 比 person 1 有更多的钱，person 1 比 person 0 有更多的钱。
 * 唯一较为安静（有较低的安静值 quiet[x]）的人是 person 7，
 * 但是目前还不清楚他是否比 person 0 更有钱。
 *
 * answer[7] = 7，
 * 在所有拥有的钱肯定不少于 person 7 的人中(这可能包括 person 3，4，5，6 以及 7)，
 * 最安静(有较低安静值 quiet[x])的人是 person 7。
 *
 * 其他的答案也可以用类似的推理来解释。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/loud-and-rich
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-31 17:34
 */
public class LoudAndRich {

    private static Map<Integer,List<Integer>> result=new HashMap<>();

//    public static void main(String[] args) {
//        int[][] richer=new int[][]{{1,0},{2,1},{3,1},{3,7},{4,3},{5,3},{6,3}};
//        int[] quiet=new int[]{3,2,5,4,6,1,7,0};
//        loudAndRich(richer,quiet);
//    }

    public static int[] loudAndRich(int[][] richer, int[] quiet) {
        int[] aw=new int[quiet.length];
        boolean[] flag=new boolean[richer.length];
        digui(richer,0,flag);


        for(int i=0;i<quiet.length;i++){
           if(!result.containsKey(i)){
               aw[i]=i;
           }

        }
        return aw;
    }

    private static void digui(int[][] richer, int num, boolean[] flag) {
        for (int i=0;i<richer.length;i++){
           if(!flag[i]){
               flag[i]=true;
               if(!result.containsKey(num)){
                   result.put(num,new ArrayList<>());
               }
               if(num==richer[i][1]){
                   result.get(num).add(richer[i][0]);
                   digui(richer,richer[i][0],flag);
               }
           }
        }
    }


    //解法超时==。

//        int[] aw=new int[quiet.length];
//        Map<Integer,List<Integer>> richerMap=new HashMap<>();
//        for (int i=0;i<richer.length;i++){
//            if(!richerMap.containsKey(richer[i][1])){
//                richerMap.put(richer[i][1],new ArrayList<Integer>());
//            }
//            richerMap.get(richer[i][1]).add(richer[i][0]);
//        }
//        Map<Integer,Integer> map=new HashMap<>();
//        for (int i=0;i<quiet.length;i++){
//            map.put(quiet[i],i);
//        }
//        for(int i=0;i<quiet.length;i++){
//           result.clear();
//           List<Integer> list=new ArrayList<>();
//           list.addAll(digui(i,richerMap,quiet));
//           Collections.sort(list);
//           aw[i]=map.get(list.get(0));
//        }
//        return aw;
//    }
//
//    private static List<Integer> digui(Integer integers, Map<Integer, List<Integer>> richerMap, int[] quiet) {
//        if(richerMap.containsKey(integers)){
//            for (Integer temp:richerMap.get(integers)){
//                digui(temp,richerMap, quiet);
//            }
//        }
//        result.add(quiet[integers]);
//        return result;
//    }

}
