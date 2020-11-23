package basics.list.list2;

public class Node {
    public Object data;
    public Node nextNode;

    public Node() {
        this(null, null);
    }

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node pointer) {
        this.data = data;
        this.nextNode = pointer;
    }
}
