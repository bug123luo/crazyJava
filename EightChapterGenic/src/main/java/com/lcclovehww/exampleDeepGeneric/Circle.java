package com.lcclovehww.exampleDeepGeneric;

import com.lcclovehww.exampleDeepGeneric.Canvas;

/**
 * @author lcc
 * @date 2019/3/20 - 16:45
 */
public class Circle extends Shape {
    @Override
    public void draw(Canvas c) {
        System.out.println("在画布" + c + "画一个圆");
    }
}
