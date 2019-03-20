package com.lcclovehww.exampleDeepGeneric;

/**
 * @author lcc
 * @date 2019/3/20 - 16:02
 */

public class A extends Apple<String> {

    @Override
    public String getInfo() {
        return "子类"+super.getInfo();
    }

}
