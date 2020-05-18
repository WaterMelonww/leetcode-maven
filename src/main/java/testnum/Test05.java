package testnum;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 左轮(haiyong.he @ luckincoffee.com)
 * @desc
 * @name Test05
 * @date 2020/4/16
 **/
public class Test05 {

    public static void main(String[] args) {
//3, 1, 7, 3, 5, 9, 4, 8
        //10,9,2,5,3,7,101,18
        List<Integer> start = Arrays.asList(3, 1, 7, 3, 5, 9, 4, 8);

        if (start.size() == 0) {
            return;
        }
        List<Integer[]> result = new ArrayList<>();
        //初始化
        Integer[] first = new Integer[1];
        first[0] = start.get(0);
        result.add(first);

        int startSize = start.size();
        //遍历节点
        for (int i = 1; i < startSize; i++) {
            int size = result.size();
            Integer num = start.get(i);
            //遍历结果集
            for (int n = size - 1; n >= 0; n--) {
                Integer[] temp = result.get(n);
                int tempSize = temp.length;
                Integer last = temp[tempSize - 1];
                //加长操作
                if (last < num) {
                    Integer[] te = new Integer[tempSize + 1];
                    System.arraycopy(temp, 0, te, 0, tempSize);
                    te[tempSize] = num;

                    if (n + 1 < size) {
                        result.set(n + 1, te);
                    }else{
                        result.add(te);
                    }
                    break;
                }
                //替换操作
                if (tempSize == 1 || temp[tempSize - 2] < num) {
                    temp[tempSize - 1] = num;
                    break;
                }
            }
        }
        for (Integer[] temp:result){
            System.out.println(Arrays.toString(temp));
        }
    }
}
