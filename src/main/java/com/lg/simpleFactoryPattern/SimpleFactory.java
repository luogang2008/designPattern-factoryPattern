package com.lg.simpleFactoryPattern;

import com.lg.ICourse;
import com.lg.JavaCourse;
import com.lg.PythonCourse;

public class SimpleFactory {

   public ICourse create(String name){
        if(name.equals("Java")){
            return new JavaCourse();
        }
        if(name.equals("Python")){
            return new PythonCourse();
        }
        return  null;
    }
}
