package test1;

import java.util.*;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 示例:
 *
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/group-anagrams
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-25 15:19
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs={"aab","aba","baa","addc"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        //方法1
//        /**
//         * 执行用时 :
//         * 21 ms
//         * , 在所有 java 提交中击败了
//         * 30.06%
//         * 的用户
//         * 内存消耗 :
//         * 43.7 MB
//         * , 在所有 java 提交中击败了
//         * 89.61%
//         * 的用户
//         */
        List<List<String>> result=new ArrayList<List<String>>();
        if (strs.length == 0) {
            return result;
        }
        Map<String,List<String>> map=new HashMap<String,List<String>>();
        for(int i=0;i<strs.length;i++){
            int[] indexmap=new int[30];
            int sum=0;
            char[] sr = strs[i].toCharArray();
            for(int j=0;j< strs[i].length();j++){
                indexmap[sr[j]-'a']=indexmap[sr[j]-'a']+1;
            }
            String key=Arrays.toString(indexmap);
            if (!map.containsKey( key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(strs[i]);
        }
        return  new ArrayList<List<String>>(map.values());

        //方法2
        //执行用时 :
        //15 ms
        //, 在所有 java 提交中击败了
        //50.84%
        //的用户
        //内存消耗 :
        //42.4 MB
        //, 在所有 java 提交中击败了
        //96.39%
        //的用户
//        Map<String, List> ans = new HashMap<String, List>();
//        for (String s : strs) {
//            char[] ca = s.toCharArray();
//            Arrays.sort(ca);
//            String key = String.valueOf(ca);
//            if (!ans.containsKey(key)){
//                ans.put(key, new ArrayList());
//            }
//            ans.get(key).add(s);
//        }
//        return new ArrayList(ans.values());
    }

}
