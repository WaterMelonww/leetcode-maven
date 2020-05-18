package test2;

import java.util.Scanner;

/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 * 输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第1个结点为链表的尾指针。
 *
 * 链表结点定义如下：
 *
 * struct ListNode
 *
 * {
 *
 * int       m_nKey;
 *
 * ListNode* m_pNext;
 *
 * };
 *
 * 详细描述：
 *
 * 接口说明
 *
 * 原型：
 *
 * ListNode* FindKthToTail(ListNode* pListHead, unsignedint k);
 *
 * 输入参数：
 *
 * ListNode* pListHead  单向链表
 *
 * unsigned int k  倒数第k个结点
 *
 * 输出参数（指针指向的内存区域保证有效）：
 *
 * 无
 *
 * 返回值：
 *
 * 正常返回倒数第k个结点指针，异常返回空指针
 * 输入说明
 * 1 输入链表结点个数
 * 2 输入链表的值
 * 3 输入k的值
 *
 * 输出描述:
 * 输出一个整数
 *
 * 示例1
 * 输入
 * 复制
 * 8
 * 1 2 3 4 5 6 7 8
 * 4
 * 输出
 * 复制
 * 5
 * @create 2020-04-18 16:28
 */
public class LianBiaoPrintK {

    static class LinkNode{
        int val;
        LinkNode next=null;
        LinkNode(int x){
            this.val=x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            LinkNode node=new LinkNode(0);
            LinkNode p=node;
            for(int i=0;i<num;i++){
                int nodeNum = sc.nextInt();
                LinkNode temp=new LinkNode(nodeNum);
                p.next=temp;
                p=p.next;
            }

            int k=sc.nextInt();
            k=num-k;
            LinkNode result=node.next;
            while (k>0){
                result=result.next;
                k--;
            }
            if(result==null){
                System.out.println(0);
            }else {
                System.out.println(result.val);
            }

        }

    }
}
