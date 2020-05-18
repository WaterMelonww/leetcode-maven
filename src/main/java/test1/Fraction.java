package test1;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 有一个同学在学习分式。他需要将一个连分数化成最简分数，你能帮助他吗？
 *
 *a0+(1/(a1+1/(a2+...)))
 *
 * 连分数是形如上图的分式。在本题中，所有系数都是大于等于0的整数。
 *
 *  
 *
 * 输入的cont代表连分数的系数（cont[0]代表上图的a0，以此类推）。返回一个长度为2的数组[n, m]，使得连分数的值等于n / m，且n, m最大公约数为1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/deep-dark-fraction
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-27 14:56
 */
public class Fraction {


    //

    public static void main(String[] args) {
        int[] cont=new int[3];
        cont[0]=0;
        cont[1]=0;
        cont[2]=3;
//        cont[3]=2;
        cont=fraction(cont);
        for (int i=0;i<cont.length;i++){
            System.out.println(cont[i]);
        }
    }
    public static int[] fraction(int[] cont) {
        int[] result=new int[2];
        result[0]=cont[0];
        result[1]=1;
        if(cont.length==1){
          return  result;
        }else {
            result[0]=cont[cont.length-1]*cont[cont.length-2]+1;
            result[1]=cont[cont.length-1];
            for (int i=2;i<cont.length;i++){
                int temp=0;
                temp=result[0];
                result[0]=result[1];
                result[1]=temp;
                result[0]=cont[cont.length-i-1]*result[1]+result[0];
            }
        }
        return result;
    }

}
