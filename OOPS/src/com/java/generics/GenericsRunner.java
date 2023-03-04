package com.java.generics;
import com.java.generics.MyCustomList;
public class GenericsRunner {
    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>();
    list.addElement("element1");
    list.addElement("element2");
        System.out.println(list);
    MyCustomList<Integer> list1 = new MyCustomList<>();
    list1.addElement(5);
//    list1.addElement(Integer.valeOf(7));
        System.out.println(list1);
    }

}
