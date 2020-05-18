package test1;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 示例 2：
 *
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-31 13:09
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] s={'H','a','n','n','a','h'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        //执行用时 :
        //1 ms
        //, 在所有 java 提交中击败了
        //100.00%
        //的用户
        //内存消耗 :
        //52.6 MB
        //, 在所有 java 提交中击败了
        //72.55%
        //的用户
        for (int i=0;i<s.length/2;i++){
            char temp=' ';
            temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }

}

