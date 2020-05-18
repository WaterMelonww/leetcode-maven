package test1;

import sun.security.util.Length;

import java.security.DigestException;
import java.util.*;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-18 13:47
 */
public class letterCombinations {

    private  List<String> temp=new ArrayList<String>();
    String[] standard={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public  List<String> letterCombinations(String digits) {
        temp.clear();
        if(digits==null||digits.length()==0){
            return temp;
        }
        diaoyong(new StringBuilder(),digits,0);
        return  temp;
    }

    private void diaoyong(StringBuilder stringBuffer,String digits, int start) {
        if (start<digits.length()){
            int flag=Integer.valueOf(String.valueOf(digits.charAt(start)));
            for(int j=0;j<standard[flag].length();j++){
                stringBuffer.append(String.valueOf(standard[flag].charAt(j)));
                diaoyong(stringBuffer,digits,start+1);
                stringBuffer.delete(start,digits.length());
            }
        }else {
            temp.add(stringBuffer.toString());
        }
    }
}
