package com.lcclovehww.exampleDeepGeneric;

import com.lcclovehww.exampleDeepGeneric.Canvas;


/**
 * @author lcc
 * @date 2019/3/20 - 16:46
 */

public class Rectangle extends Shape{
    @Override
    public void draw(Canvas c) {
        System.out.println("把一个矩形画在画布" + c +"上");
    }
}
