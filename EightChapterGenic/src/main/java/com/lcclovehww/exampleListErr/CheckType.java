package com.lcclovehww.exampleListErr;

/**
 * @author lcc
 * @date 2019/3/20 - 14:16
 */
public class CheckType {

    public static void main(String[] args) {
        StrList strList = new StrList();
        strList.add("quanweizhinan");
        strList.add("lkljljljlj");
        strList.add("test123");
//        strList.add(5);
        System.out.println(strList);
        for (int i = 0; i < strList.size(); i++) {
            String str = strList.get(i);
        }
    }
}
