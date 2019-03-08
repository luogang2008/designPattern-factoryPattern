package com.lg.factoryMethodPattern;

import com.lg.ICourse;

public class FactoryMethodPatternTest {

    public static void main(String[] args) {

        ICourseFactory javaFactory = new JavaFactory();
        PythonFactory pythonFactory = new PythonFactory();

        ICourse javaCourse = javaFactory.create();
        ICourse pythonCourse = pythonFactory.create();

        javaCourse.study();
        pythonCourse.study();

    }
}
