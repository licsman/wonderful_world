package basics.stack;

public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.input("a");
        arrayStack.input("b");
        arrayStack.input("c");
        arrayStack.input("d");
        arrayStack.input("a");
        arrayStack.input("b");
        arrayStack.input("c");
        arrayStack.input("d");

        arrayStack.output();

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayStack.get(i));
        }
    }
}
