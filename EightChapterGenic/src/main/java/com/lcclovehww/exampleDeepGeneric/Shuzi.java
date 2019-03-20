package com.lcclovehww.exampleDeepGeneric;

import com.sun.xml.internal.bind.v2.runtime.output.DOMOutput;

/**
 * @author lcc
 * @date 2019/3/20 - 17:12
 */
public class Shuzi<T extends Number> {

    T col;

    public static void main(String[] args) {
        Shuzi<Integer> ai = new Shuzi<Integer>();
        Shuzi<Double> ad = new Shuzi<Double>();
//        Shuzi<String> as = new Shuzi<String>();
    }
}
