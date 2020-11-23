package basics.list.list2.test;

import basics.list.list2.MyList;

public class testListFeature {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.addElement("miaojw");
        myList.addElement("mengqi");
        myList.addElement("miaojw");
        myList.addElement("mengqi");
        myList.addElement("miaojw");
        myList.addElement("mengqi");

        System.out.println(myList.size());

    }
}
