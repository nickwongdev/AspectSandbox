package com.yskts;

import com.yskts.aspect.TestAnnotation;

/**
 * Created by Nick on 4/12/14.
 */
public class Main {
    @TestAnnotation
    public static void main(String[] args) {
        final TestApp testApp = new TestApp();
        testApp.doSomething();
    }
}
