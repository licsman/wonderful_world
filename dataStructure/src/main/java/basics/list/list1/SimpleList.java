package basics.list.list1;

import basics.list.list1.node.Node;

public class SimpleList {
    private Node head;

    public SimpleList() {
        head = new Node();
    }

    public int length() {       //求带头结点单链表的长度
        int length = 0;
        Node p = head.next;
        while(p != null){
            p = p.next;
            length++;
        }
        return length;
    }

    public void insert(int i, Object x)throws Exception {   //在带头结点的单链表中的第i个结点之前插入值为x的新结点
        Node p = head;
        int j=0;
        while(j < i && p != null) {
            p = p.next;
            j ++;
        }
        if(j > i || p == null)
            throw new Exception("插入位置不合理");
        Node s = new Node(x);
        s.next = p.next;
        p.next = s;
    }

    public Object get(int i)throws Exception{   //查找带头结点的单链表中的第i个结点
        int j=0;
        Node p=head.next;
        while(j<i&&p!=null){
            p=p.next;
            j++;
        }
        if(j>i||p==null)
            throw new Exception("查找位置不合理");
        return p.data;
    }

    public int indexof(Object x){      //在带头结点的单链表中查找值为x的结点
        int j=0;
        Node p=head.next;
        while(p!=null&&!p.data.equals(x)){
            p=p.next;
            j++;
        }
        if(p!=null)
            return j;
        else
            return -1;
    }

    public void remove(int i)throws Exception{     //删除带头结点的单链表中第i个结点
        Node p=head;     //p一定要等于head;不能等于head.next
        int j=0;
        while(p.next!=null&&j<i){   //一定是p.next!=null,不能p!=null,否则会在边界处出错！
            p=p.next;
            j++;
        }
        if(j>i||p.next==null)
            throw new Exception("删除位置不合理");
        p.next=p.next.next;
    }

    public void display(){             //输出单链表中所有结点
        Node p=head.next;
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println();
    }
}
