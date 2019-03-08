package com.lg.factoryMethodPattern;

import com.lg.ICourse;
import com.lg.JavaCourse;

public class JavaFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
