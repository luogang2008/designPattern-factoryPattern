package com.lg.factoryMethodPattern;

import com.lg.ICourse;
import com.lg.PythonCourse;

public class PythonFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
