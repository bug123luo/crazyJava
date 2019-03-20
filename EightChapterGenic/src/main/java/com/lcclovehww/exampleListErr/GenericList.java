package com.lcclovehww.exampleListErr;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lcc
 * @date 2019/3/20 - 14:23
 */
public class GenericList {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("Structs quanweizhinan");
        strList.add("qingliangjiqiyeyingyongshizhan");

//        strList.add(5);
        for (int i = 0; i < strList.size(); i++) {
            String str = strList.get(i);
        }
    }
}
