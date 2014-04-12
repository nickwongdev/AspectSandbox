package com.yskts;

import com.yskts.aspect.TestAnnotation;

/**
 * Created by Nick on 4/12/14.
 */
public class TestApp {

    @TestAnnotation
    public void doSomething() {
        System.out.println("In Method");
    }
}
