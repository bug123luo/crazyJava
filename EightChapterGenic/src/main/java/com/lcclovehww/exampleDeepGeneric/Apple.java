package com.lcclovehww.exampleDeepGeneric;

/**
 * @author lcc
 * @date 2019/3/20 - 15:33
 */
public class Apple<T> {

    private  T info;
    public Apple(){}

    public Apple(T info){
        this.info = info;
    }
    public void setInfo(T info){
        this.info = info;
    }
    public T getInfo(){
        return this.info;
    }

    public static void main(String[] args) {
        Apple<String> a1 = new Apple<String>("苹果");
        System.out.println(a1.getInfo());

        Apple<Double> a2 = new Apple<Double>(5.67);
        System.out.println(a2.getInfo());
    }
}
