import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * @create 2020-04-28 20:01
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] num=new int[][]{{1,2},{1,3},{2,3}};
        HashMap<Integer,Integer> the=new HashMap<>();
        HashMap<Integer,Integer> my=new HashMap<>();
        for(int i=0;i<num.length;i++){
           if(the.containsKey(num[i][1])){
               the.put(num[i][1],the.get(num[i][1])+1);
           }else {
               the.put(num[i][1],1);
           }
           if(my.containsKey(num[i][0])){
               my.put(num[i][0],my.get(num[i][0])+1);
           }else {
               my.put(num[i][0],1);
           }
        }

        int result=-1;
        for(int i=1;i<=N;i++){
            if(the.containsKey(i)&&the.get(i)==(N-1)&&!my.containsKey(i)){
                result=i;
            }
        }
        System.out.println(result);
    }
}
