package com.cleancode.main.encapsulation;

import static java.lang.Math.pow;

public class Time {
    private long nano;
    public Time(long nano){
        this.nano = nano;
    }
    public long getMilliTime() {
        return (long) (nano /pow(10,6));
    }
    public long getNanoTime() {
        return nano;
    }
}
