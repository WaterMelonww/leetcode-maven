package test2;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 输入一个单向链表和一个节点的值，从单向链表中删除等于该值的节点，删除后如果链表中无节点则返回空指针。
 *
 * 链表结点定义如下：
 *
 * struct ListNode
 *
 * {    int       m_nKey;
 *      ListNode* m_pNext;
 * };
 *
 * 详细描述：
 *
 * 本题为考察链表的插入和删除知识。
 *
 * 链表的值不能重复
 *
 * 构造过程，例如
 *
 * 1 <- 2
 *
 * 3 <- 2
 *
 * 5 <- 1
 *
 * 4 <- 5
 *
 * 7 <- 2
 *
 * 最后的链表的顺序为 2 7 3 1 5 4
 *
 * 删除 结点 2
 *
 * 则结果为 7 3 1 5 4
 *
 * 输入链表结点个数
 * 2 输入头结点的值
 * 3 按照格式插入各个结点
 * 4 输入要删除的结点的值
 *
 * 输出描述:
 * 输出删除结点后的序列，每个数后都要加空格
 *
 * 示例1
 * 输入
 * 复制
 * 5
 * 2
 * 3 2
 * 4 3
 * 5 2
 * 1 4
 * 3
 * 输出
 * 复制
 * 2 5 4 1
 * @create 2020-04-18 10:41
 */
public class DeleteLianBiao {
    static class ListNode{
        int val;
        ListNode next=null;
        ListNode(int x){
            this.val=x;
        }
    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNext()){
//            int num = sc.nextInt();
//            int first=sc.nextInt();
//            ListNode node=new ListNode(first);
//            for(int i=0;i<num-1;i++){
//                int nextNum=sc.nextInt();
//                ListNode next=new ListNode(nextNum);
//                int tempNum=sc.nextInt();
//                ListNode pNode=node;
//                while (pNode!=null){
//                    ListNode qNode=pNode.next;
//                    if(pNode.val==tempNum){
//                        pNode.next=next;
//                        next.next=qNode;
//                        break;
//                    }
//                    pNode=pNode.next;
//                }
//            }
//            int deleteNum=sc.nextInt();
//
//
//
//            ListNode head=new ListNode(0);
//            head.next=node;
//            ListNode p=head;
//            ListNode q=head.next;
//            while (q!=null){
//                if(q.val==deleteNum){
//                    p.next=q.next;
//                }
//                p=p.next;
//                q=q.next;
//            }
//            node=head.next;
//            while (node!=null){
//                System.out.print(node.val+" ");
//                node=node.next;
//            }
//            System.out.println();
//        }
//    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int first=sc.nextInt();
            ListNode node=new ListNode(first);
            for(int i=0;i<num-1;i++){
                int nextNum=sc.nextInt();
                ListNode next=new ListNode(nextNum);
                int tempNum=sc.nextInt();
                ListNode pNode=node;
                while (pNode!=null){
                    ListNode qNode=pNode.next;
                    if(pNode.val==tempNum){
                        pNode.next=next;
                        next.next=qNode;
                        break;
                    }
                    pNode=pNode.next;
                }
            }
            int deleteNum=sc.nextInt();

        //大佬思路 删除节点时用栈的思想 只要该节点不是要删除的那个就入栈
            Stack<Integer> stack=new Stack<>();
            while (node!=null){
                if(node.val!=deleteNum){
                    stack.push(node.val);
                }
                node=node.next;
            }
            ListNode result=new ListNode(0);
            ListNode p=result;
            while (!stack.isEmpty()){
                p.next= new ListNode(stack.pop());
                p=p.next;
            }
            result=result.next;
            while (result!=null){
                System.out.println(result.val+" ");
                result=result.next;
            }
            System.out.println();
        }
    }

}
