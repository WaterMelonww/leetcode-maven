package test1;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-19 14:38
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String a=String.valueOf(x);
        String b=new StringBuilder(a).reverse().toString();
        return a.equals(b);


//        String result=String.valueOf(x);
//        int i=0;
//        while (i<result.length()/2){
//            if(result.charAt(i)==result.charAt(result.length()-i-1)){
//                i++;
//            }else {
//                return false;
//            }
//        }
//        return true;
    }
}
