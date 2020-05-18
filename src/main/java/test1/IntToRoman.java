package test1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-to-roman
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-18 14:58
 */
public class IntToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(12));
    }
    public static String intToRoman(int num) {
        /**
         * 贪心算法
         */
        int[] key={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] value={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String result="";
        for(int i=key.length-1;i>=0;i--){
            while(num>=key[i]){
                result+=value[i];
                num-=key[i];
            }
        }
        return result;
    }

}
