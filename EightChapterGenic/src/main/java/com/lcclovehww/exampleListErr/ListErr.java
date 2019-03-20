package com.lcclovehww.exampleListErr;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lcc
 * @date 2019/3/20 - 11:06
 */
public class ListErr {

    public static void main(String[] args) {
        List strList = new ArrayList<>();
        strList.add("Structs2 权威指南");
        strList.add("基于J2EE的Ajax宝典");
        strList.add("sdfsf");
//        strList.add(5);

        for (int i = 0; i < strList.size(); i++) {
            String str = (String)strList.get(i);
        }

    }
}
