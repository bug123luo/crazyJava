package com.lcclovehww.exampleListErr;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lcc
 * @date 2019/3/20 - 14:13
 */
public class StrList {

    private List strList = new ArrayList<>();

    public boolean add(String ele){
        return strList.add(ele);
    }

    public String get(int index){
        return (String)strList.get(index);
    }

    public int size() {
        return strList.size();
    }
}
