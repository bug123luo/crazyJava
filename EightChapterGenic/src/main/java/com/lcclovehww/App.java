package com.lcclovehww;

import com.lcclovehww.exampleDeepGeneric.Canvas;
import com.lcclovehww.exampleDeepGeneric.Circle;
import org.omg.CORBA.OBJ_ADAPTER;
import sun.java2d.pipe.AlphaPaintPipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List<String> l1 = new ArrayList<String>();
        List<Integer> l2= new ArrayList<Integer>();

        System.out.println(l1.getClass() == l2.getClass());

        List<String> stringList = new ArrayList<String>();

       App app= new App();
//       app.test(stringList);
        List<?> c = new ArrayList<String>();
        c.add(null);


        List<Circle> circleList = new ArrayList<Circle>();
        Canvas canvas = new Canvas();
        canvas.drawAll(circleList);
    }

    public void test(List<?> c){
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }
}
