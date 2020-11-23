package basics.list.list1;


import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(100);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        reverse(list);
        System.out.println(list);

    }

    public static void reverse(List<Integer> list) {
        int i = 0;
        int len = list.size() / 2;
    }

}
