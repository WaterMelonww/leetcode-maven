package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-30 17:07
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings=new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }

    public  static String longestCommonPrefix(String[] strs) {
        //自己的解法
        //执行用时 :
        //1 ms
        //, 在所有 java 提交中击败了
        //85.90%
        //的用户
        //内存消耗 :
        //36 MB
        //, 在所有 java 提交中击败了
        //87.85%
        //的用户
//        StringBuilder sb=new StringBuilder();
//        if(strs.length==0){
//            return "";
//        }
//        String s=strs[0];
//        for (int i=0;i<strs.length;i++){
//            if (s.length()>strs[i].length()){
//                s=strs[i];
//            }
//        }
//        char[] chars = s.toCharArray();
//        boolean flag=true;
//        for (int i=0;i<chars.length;i++){
//            int count=0;
//            for (int j=0;j<strs.length;j++){
//                if(chars[i]==strs[j].charAt(i)&&flag){
//                    count=count+1;
//                    flag=true;
//                    continue;
//                }
//                flag=false;
//            }
//            if(count==strs.length){
//                sb.append(chars[i]);
//            }
//        }
//        return String.valueOf(sb);
//



        //大佬解法
        //
        if(strs.length == 0){
            return "";
        }
        String str = strs[0];
        for(int i = 1; i < strs.length; i++){
            System.out.println(strs[i].indexOf(str));
            while(strs[i].indexOf(str) != 0){
                str=str.substring(0, str.length() - 1);
            }
        }
        return str;
    }



}
