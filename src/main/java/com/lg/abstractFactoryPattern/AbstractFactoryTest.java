package com.lg.abstractFactoryPattern;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory  = new JavaFactory();

        System.out.println("------------JavaFactory------------");
        factory.createCourse().study();
        factory.createNote().showNote();
        factory.createVideo().playVideo();


        System.out.println("------------PythonFactory------------");
        factory = new PythonFactory();
        factory.createCourse().study();
        factory.createNote().showNote();
        factory.createVideo().playVideo();


    }
}
