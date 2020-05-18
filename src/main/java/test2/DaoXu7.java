package test2;

import java.util.*;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 如果统计的个数相同，则按照ASCII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计。
 *
 * 实现以下接口：
 * 输入一个字符串，对字符中的各个英文字符，数字，空格进行统计（可反复调用）
 * 按照统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASII码由小到大排序输出
 * 清空目前的统计结果，重新统计
 * 调用者会保证：
 * 输入的字符串以‘\0’结尾。
 *
 *
 *
 * 输入描述:
 * 输入一串字符。
 *
 * 输出描述:
 * 对字符中的
 * 各个英文字符（大小写分开统计），数字，空格进行统计，并按照统计个数由多到少输出,如果统计的个数相同，则按照ASII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计。
 *
 * 示例1
 * 输入
 * 复制
 * aadddccddc
 * 输出
 * 复制
 * dca
 * @create 2020-04-16 14:43
 */
public class DaoXu7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            int[] temp=new int[128];
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>0&&s.charAt(i)<127){
                    temp[s.charAt(i)]++;
                }
            }
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<128;i++){
                if(temp[i]!=0){
                    map.put(i,temp[i]); //key为90 value为2次数
                }
            }
            Map<Integer,Character> result=new TreeMap<>();
            for(Integer ss:map.keySet()){
                int i=ss;
                char ch= (char) i;
                result.put(map.get(ss) * 128 + 128 - ss, ch); //将次数和128相乘在相加减去字符的asii码值 如 2*128+128-90   2*128+128-91 即90a字符出现两次 b字符出现两次 但减去后a的字符在b后面
            }
            StringBuffer re=new StringBuffer();
            for(Integer ss:result.keySet()){
                re.append(result.get(ss));    //然后将所有字符串拼接在一起 因为是按照升序顺序拍好的，所以需要降序输出
            }
            re.reverse();
            System.out.println(re.toString());
        }

    }
}
