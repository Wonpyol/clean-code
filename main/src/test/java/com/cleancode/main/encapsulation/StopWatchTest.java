package com.cleancode.main.encapsulation;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static java.lang.Math.pow;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StopWatchTest {
    private long expectedElapsedTime = 100L;
    @Test
    public void should_return_elapsed_mille(){
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        doSometing();

        stopWatch.stop();

        Time time = stopWatch.getElapsedTime();

        assertThat(time.getMilliTime()).isGreaterThan(expectedElapsedTime);

    }
    @Test
    public void should_return_elapsed_nano(){
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        doSometing();

        stopWatch.stop();

        Time time = stopWatch.getElapsedTime();

        assertThat(time.getNanoTime()).isGreaterThan(expectedElapsedTime * (long)pow(10, 6));

    }


    private void doSometing(){
        try {
            Thread.sleep(expectedElapsedTime);
        } catch (InterruptedException e){

        }
    }
}
