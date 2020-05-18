package test1;

import java.util.List;
import java.util.Stack;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc" 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-31 9:00
 */
public class ReverseWords {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(reverseWords("Let's take LeetCode contest"));
        long end = System.currentTimeMillis();
        System.out.println("程序运行时间："+(end-start)+"ms");
    }
    private static String reverseWords(String s) {
        //大佬写法
        String[] str = s.split(" ");
        for(int i = 0; i < str.length; i++){
            str[i] = new StringBuilder(str[i]).reverse().toString();
        }
        return String.join(" ", str);

//        String[] split = s.split("\\s+");
//        StringBuilder sb=new StringBuilder();
//        for( int i=0;i< split.length;i++){
//            StringBuilder temp=new StringBuilder(split[i]);
//            sb.append(temp.reverse());
//            if(i!=split.length-1){
//                sb.append(" ");
//            }
//        }
//        return sb.toString();

        //执行用时 :
        //58 ms
        //, 在所有 java 提交中击败了
        //14.60%
        //的用户
        //内存消耗 :
        //38.6 MB
        //, 在所有 java 提交中击败了
        //96.88%
        //的用户
//        char[] chars = (s+" ").toCharArray();
//        Stack<Character> stack=new Stack();
//        StringBuilder sb=new StringBuilder();
//        for (int i=0;i<chars.length;i++){
//            if(chars[i]==' '){
//               while (!stack.empty()){
//                   sb.append(stack.pop());
//               }
//               sb.append(" ");
//            }else {
//                stack.push(chars[i]);
//            }
//        }
//        return sb.toString().substring(0,sb.length()-1);
        //执行用时 :
        //21 ms
        //, 在所有 java 提交中击败了
        //20.88%
        //的用户
        //内存消耗 :
        //38.3 MB
        //, 在所有 java 提交中击败了
        //97.06%
        //的用户
//        if(s.length()==0){
//            return "";
//        }
//        StringBuilder sb=new StringBuilder();
//        String temp=sb.append(s).reverse().toString();
//        String[] split = temp.split("\\s+");
//        StringBuilder result=new StringBuilder();
//        for(int i=split.length-1;i>=0;i--){
//            result.append(split[i]);
//            result.append(" ");
//        }
//        return result.toString().substring(0,result.length()-1);
        //执行用时 :
        //20 ms
        //, 在所有 java 提交中击败了
        //21.80%
        //的用户
        //内存消耗 :
        //38.6 MB
        //, 在所有 java 提交中击败了
        //96.88%
        //的用户
//        if(s.length()==0){
//            return "";
//        }
//        String[] split = s.split("\\s+");
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<split.length;i++){
//            StringBuilder temp=new StringBuilder();
//            temp.append(split[i]);
//            temp.reverse();
//            sb.append(temp+" ");
//        }
//        return sb.toString().substring(0,sb.length()-1);
    }
}
