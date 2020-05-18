package test1;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-19 19:25
 */
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
//        System.out.println(1%10);
    }
    public static int reverse(int x) {
//        int result=0;
//        int temp=x;
//        while(x!=0){
//                result=result*10;
//                result+=x%10;
//                x=x/10;
//            }
//            if(result>0&&temp<0||result<0&&temp>0){
//                return 0;
//            }
//            return result;
//
//
//
////        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
////            return 0;
////        }
////        return (int) result;
        long result=0;
        while(x!=0){
            result=result*10;
            result+=x%10;
            x=x/10;
        }
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
            return 0;
        }
        return (int) result;
    }
}
