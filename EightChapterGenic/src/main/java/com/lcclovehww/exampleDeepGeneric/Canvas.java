package com.lcclovehww.exampleDeepGeneric;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lcc
 * @date 2019/3/20 - 16:52
 */
public class Canvas {
    public void drawAll(List<? extends Shape> shapes) {
        for (Shape s : shapes) {
            Shape s1=s;
            s1.draw(this);
        }
    }

    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<Circle>();
        circleList.add(new Circle());
        Canvas c = new Canvas();
        c.drawAll(circleList);
    }
}
