/**
 * @author wangru(ru.wang @ luckincoffee.com)
 * @describe
 *
 * @create 2020-04-28 19:09
 */
public class Test {

     static class LinkNode{
        int val;
        LinkNode next;
        LinkNode(int num){
            this.val=num;
        }
    }
   public static LinkNode margeTwo(LinkNode l1,LinkNode l2){
         LinkNode p=l1;
         LinkNode q=l2;
         LinkNode temp=new LinkNode(0);
         LinkNode index=temp;
         while (q!=null&&p!=null){
             if(q.val>p.val){
                 index.next=p;
                 p=p.next;
                 index=index.next;
             }else {
                 index.next=q;
                 q=q.next;
                 index=index.next;
             }
         }
         if(q!=null){
             index.next=q;
         }
         if (p!=null){
             index.next=p;
         }
         LinkNode result=temp.next;
         return result;
   }

    public static void main(String[] args) {
        LinkNode l1=new LinkNode(1);
        LinkNode l2=new LinkNode(2);
        LinkNode l3=new LinkNode(4);
        l1.next=l2;
        l2.next=l3;

        LinkNode h1=new LinkNode(1);
        LinkNode h2=new LinkNode(3);
        LinkNode h3=new LinkNode(4);
        h1.next=h2;
        h2.next=h3;
        LinkNode result = margeTwo(l1, h1);
        while (result!=null){
            System.out.print( result.val+ " ");
            result=result.next;
        }
    }

}
