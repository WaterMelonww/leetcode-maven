package test2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 *
 * 输入描述:
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 *
 * 输出描述:
 * 输出合并后的键值对（多行）
 *
 * 示例1
 * 输入
 * 复制
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * 输出
 * 复制
 * 0 3
 * 1 2
 * 3 4
 * @create 2020-04-15 20:12
 */
public class ZhengXu8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int num=sc.nextInt();
        for (int i=0;i<num;i++){
            Integer x=sc.nextInt();
            Integer y=sc.nextInt();
            if(map.containsKey(x)){
              map.put(x,y+map.get(x));
           }else {
                map.put(x,y);
            }
        }
        for(Map.Entry<Integer,Integer> a:map.entrySet()){
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}
