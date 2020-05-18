package test1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
 *
 * 例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2020-04-15 16:25
 */
public class CountDigitOne {
    public static void main(String[] args) {
        System.out.println(countDigitOne(12));
    }

    public static int countDigitOne(int n) {
        int count=0;
        while(n!=0){
            int k=n/10;

            for(int i=0;i<=n%10;i++){

            }
            n=n/10;
        }


        return count;
    }
}
