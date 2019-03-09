package com.lg.abstractFactoryPattern;

import com.lg.ICourse;
import com.lg.INote;
import com.lg.IVideo;

public interface AbstractFactory {
    ICourse createCourse();
    INote createNote();
    IVideo createVideo();
}
