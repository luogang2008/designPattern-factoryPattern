package com.lg.simpleFactoryPattern;

import com.lg.ICourse;

public class SimpleFactoryPatternTest {


    public static void main(String[] args) {
        //直接创建
//        ICourse course1 = new JavaCourse();
//        ICourse course2 = new PythonCourse();
//        course1.study();
//        course2.study();


        //简单工厂创建
        SimpleFactory simpleFactory = new SimpleFactory();
        ICourse course3 = simpleFactory.create("Java");
        ICourse course4 = simpleFactory.create("Python");
        course3.study();
        course4.study();

    }



}
