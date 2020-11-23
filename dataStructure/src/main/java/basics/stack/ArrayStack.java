package basics.stack;

public class ArrayStack {
    private String [] items;
    private int count;
    int size;

    //初始化 链式栈
    public ArrayStack(int size) {
        this.items = new String[size];
        this.count = 0;
        this.size = size;
    }

    //入栈
    public boolean input(String item) {
        if (count == size)
            return false;
        items[count] = item;
        count ++;
        return true;
    }

    //出栈
    public String output() {
        if (count == 0) {
            return null;
        }
        count --;
        return items[count - 1];
    }

    //获取栈中元素
    public String get(int p) {
        if (p < 0 || p >= count)
            return null;
        return items[p];
    }
}