package test1;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: true
 * 解释: 20 = 1
 * 示例 2:
 *
 * 输入: 16
 * 输出: true
 * 解释: 24 = 16
 * 示例 3:
 *
 * 输入: 218
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/power-of-two
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-30 16:33
 *
 *
 *
 * 解题思路：
 * 若n=2^x 且x为自然数（即n为2的幂），则一定满足：
 * 1.恒有 n&(n-1)==0   因为：n二进制最高位为1，其余所有位为0，n-2二进制最高位为0，其余所有位为1，
 * 2.一定满足 n>0
 *
 * 2^0 n=0001 n-1=0000 n&(n-1)=(0001)&(0000)==0
 * 2^1 n=0010 n-1=0001 n&(n-1)=(0010)&(0001)==0
 * 2^2 n=0100 n-1=0011 n&(n-1)=(0100)&(0011)==0
 * 2^3 n=1000 n-1=0111 n&(n-1)=(1000)&(0111)==0
 */
public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {
        //正常人的思路= =。
//        执行用时 :
//2 ms
//, 在所有 java 提交中击败了
//24.04%
//的用户
//内存消耗 :
//33.8 MB
//, 在所有 java 提交中击败了
//12.13%
//的用户
//       if(n<1){
//           return false;
//       }
//       if (n==1){
//           return true;
//       }
//       while (n>1){
//           if(n%2==1){
//               return false;
//           }
//           n=n/2;
//       }
//       return true;


        //大佬的思路1
        //执行用时 :
        //1 ms
        //, 在所有 java 提交中击败了
        //100.00%
        //的用户
        //内存消耗 :
        //33.4 MB
        //, 在所有 java 提交中击败了
        //14.06%
        //的用户
//        return (n > 0) && (n & -n) == n;

        //大佬思路2
        //1 ms
        //, 在所有 java 提交中击败了
        //100.00%
        //的用户
        //内存消耗 :
        //33.5 MB
        //, 在所有 java 提交中击败了
        //12.36%
        //的用户
        return  (n>0) && ((n&(n-1))==0);
    }
}
