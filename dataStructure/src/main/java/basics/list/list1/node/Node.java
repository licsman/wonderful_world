package basics.list.list1.node;

public class Node {
    public Object data;    //存放节点值
    public Node next;      //后继节点的引用 ,将data，next定义为public类型，就不需要get，set方法了
    public Node(){
        this(null,null);    //无参时构造函数
    }
    public Node(Object data){  //带一个参数时的构造函数
        this.data=data;
    }
    public Node(Object data,Node next){    //带两个参数时构造函数
        this.data=data;
        this.next=next;
    }
}
