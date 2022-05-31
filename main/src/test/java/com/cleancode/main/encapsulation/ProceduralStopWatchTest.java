package com.cleancode.main.encapsulation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static java.lang.Math.pow;
import static org.assertj.core.api.Assertions.assertThat;




@SpringBootTest
public class ProceduralStopWatchTest {
    private long expectedElapsedTime = 100L;

    @Test
    public void should_return_elapsed_milli_seconds_by_none_object(){
        ProceduralStopWatch stopWatch = new ProceduralStopWatch();

        stopWatch.startTime = System.currentTimeMillis();

        doSometing();

        stopWatch.stopTime = System.currentTimeMillis();

        long elapsedTime = stopWatch.getElapsedTime();

        assertThat(elapsedTime).isGreaterThan(expectedElapsedTime);
    }

    @Test
    public void should_return_elapsed_milli_seconds(){
        ProceduralStopWatch stopWatch = new ProceduralStopWatch();

        stopWatch.startTime = System.currentTimeMillis();

        doSometing();

        stopWatch.stopTime = System.currentTimeMillis();

        long elapsedTime = stopWatch.getElapsedTime();

        assertThat(elapsedTime).isGreaterThan(expectedElapsedTime);
    }

    @Test
    public void should_return_elapsed_nano_seconds(){
        ProceduralStopWatch stopWatch = new ProceduralStopWatch();

        stopWatch.startNanoTime = System.nanoTime();

        doSometing();

        stopWatch.stopNanoTime = System.nanoTime();

        long elapsedTime = stopWatch.getElapsedNanoTime();

        assertThat(elapsedTime).isGreaterThan(expectedElapsedTime *(long)pow(10,6));
    }

    private void doSometing(){
        try {
            Thread.sleep(expectedElapsedTime);
        } catch (InterruptedException e){

        }
    }
}
