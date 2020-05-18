package test1;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 *
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-31 13:32
 */
public class RotateRight {
     static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }

    public static void main(String[] args) {
       ListNode temp1=new ListNode(1);
       ListNode temp2=new ListNode(2);
//       ListNode temp3=new ListNode(3);
//       ListNode temp4=new ListNode(4);
//       ListNode temp5=new ListNode(5);
       temp1.next=temp2;
//       temp2.next=temp3;
//       temp3.next=temp4;
//       temp4.next=temp5;
       System.out.println( rotateRight(temp1,2));
    }

    public static ListNode rotateRight(ListNode head, int k) {

         //看官网解释优化代码
        if (head==null||head.next==null||k==0){
            return head;
        }
        ListNode node=head;
        int count=1;
        while (node.next!=null){
            count++;
            node=node.next;
        }
        if(k%count==0){
            return head;
        }
        node.next=head;
        count=count-k%count;
        ListNode temp=head;
        while(count>0){
            node=temp;
            temp=temp.next;
            count--;
        }
        node.next=null;
        return  temp;
         //执行用时 :
        //1 ms
        //, 在所有 java 提交中击败了
        //99.97%
        //的用户
        //内存消耗 :
        //36.4 MB
        //, 在所有 java 提交中击败了
        //82.48%
        //的用户
//        if (head==null||head.next==null||k==0){
//            return head;
//        }
//        ListNode node=head;
//        int count=0;
//        while (node!=null){
//            count++;
//            node=node.next;
//        }
//        if(k%count==0){
//            return head;
//        }
//        count=count-k%count;
//        ListNode temp=head;
//        while(count>0){
//            node=temp;
//            temp=temp.next;
//            count--;
//       }
//        node.next=null;
//        node=temp;
//        while (temp!=null&&temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=head;
//        return  node;
//
    }
}
