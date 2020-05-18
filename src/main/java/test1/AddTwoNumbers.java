package test1;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create 2019-12-17 15:39
 */
public class AddTwoNumbers {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root=new ListNode(0);
        ListNode temp=root;
        boolean flag=false;
        while(l1!=null||l2!=null||flag){
            ListNode newNode=new ListNode(1);
            temp.next=newNode;
            temp=newNode;
            int x= l1==null ? 0:l1.val;
            int y= l2==null ? 0:l2.val;
            if(flag){
                temp.val=x+y+1;
                flag=false;
            }else{
                temp.val=x+y;
            }
            if(temp.val>=10){
                temp.val=temp.val%10;
                flag=true;
            }
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return root.next;
    }

}
