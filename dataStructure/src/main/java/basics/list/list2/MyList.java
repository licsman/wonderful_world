package basics.list.list2;

public class MyList {
    private Node head;

    public MyList() {
        this.head = new Node();
    }

    public int length() {
        Node next = head.nextNode;
        int length = 0;
        while (next != null) {
            next = next.nextNode;
            length++;
        }
        return length;
    }

    public void append(Object data) throws Exception {
        Node p = head;
        int i = 0;
        while (i < length()) {
            p = p.nextNode;
            i++;
        }
        Node newNode = new Node(data);
        newNode.nextNode = p.nextNode;
        p.nextNode = newNode;
    }

    public void insert(int i, Object x) throws Exception {   //在带头结点的单链表中的第i个结点之前插入值为x的新结点
        Node p = head;
        int j=0;
        while(j < i && p != null) {
            p = p.nextNode;
            j ++;
        }
        if(j > i || p == null)
            throw new Exception("插入位置不合理");
        Node s = new Node(x);
        s.nextNode = p.nextNode;
        p.nextNode = s;
    }

    public Object get(int index) {
        int point = 0;
        Node p = head.nextNode;
        while (point < index && p != null) {
            p = p.nextNode;
            point ++;
        }
        if (p == null) {
            return null;
        }
        return p.data;
    }

    public void addElement(Object object) {
        Node point = this.head;
        int i = 0;
        while (i < length()) {
            point = point.nextNode;
            i ++;
        }
        Node element = new Node(object);
        element.nextNode = point.nextNode;
        point.nextNode = element;
    }

    public int size() {
        Node point = this.head.nextNode;
        int size = 0;
        while (point != null) {
            point = point.nextNode;
            size ++;
        }
        return size;
    }

    public MyList reverse() {
        MyList myList = new MyList();
        Node head1 = myList.head;
        Node p = this.head;
        while (p.nextNode != null) {
            Node newNode = new Node(p.nextNode.data);
            if (head1.nextNode != null) {
                newNode.nextNode = head1.nextNode;
                head1.nextNode = newNode;
            }
            head1.nextNode = newNode;
            p = p.nextNode;
        }
        return myList;
    }
}