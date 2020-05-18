package test1;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 *
 *
 * ........................................................没做完
 * 一个强密码应满足以下所有条件：
 *
 * 由至少6个，至多20个字符组成。
 * 至少包含一个小写字母，一个大写字母，和一个数字。
 * 同一字符不能连续出现三次 (比如 "...aaa..." 是不允许的, 但是 "...aa...a..." 是可以的)。
 * 编写函数 strongPasswordChecker(s)，s 代表输入字符串，如果 s 已经符合强密码条件，则返回0；否则返回要将 s 修改为满足强密码条件的字符串所需要进行修改的最小步数。
 *
 * 插入、删除、替换任一字符都算作一次修改。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/strong-password-checker
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-25 14:19
 */
public class StrongPasswordChecker {
//    public static void main(String[] args) {
//        System.out.println(strongPasswordChecker(""));
//    }
    public static int strongPasswordChecker(String s) {
        char[] chars = s.toCharArray();
        int xiaoxie=0;
        int daxie=0;
        int num=0;
        if(s.length()<=6){
            return 6-s.length();
        }
        if(s.length()>=20){
            return s.length()-20;
        }
        for(int i=0;i<s.length();i++){
            if(chars[i]>='a'&&chars[i]<='z'){
                xiaoxie++;
            }
            if(chars[i]>='A'&&chars[i]<='Z'){
                daxie++;
            }
            if(chars[i]>='0'&&chars[i]<='9'){
                num++;
            }
        }
        if(daxie==0||xiaoxie==0||num==0){
            return 0;
        }
        return 0;
    }
}
