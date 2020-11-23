package basics.list.list2.test;

import basics.list.list2.MyList;

public class TestMyList {
    public static void main(String[] args) throws Exception {
        MyList myList = new MyList();
        myList.append("sdsa0");
        myList.append("sdsa1");
        myList.append("sdsa2");
        myList.append("sdsa3");
        myList.append("sdsa4");
        myList.append("sdsa5");

        for (int i = 0; i < myList.length(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("------After Reverse-------");

        MyList re = myList.reverse();

        for (int i = 0; i < re.length(); i++) {
            System.out.println(re.get(i));
        }
    }
}
