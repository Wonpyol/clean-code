package com.cleancode.main.ploymorphsim;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PolymorpysimTest {
    @Test
    public void test(){
        Man man = new Man();
        Woman woman = new Woman();
        man.printInfo();
        System.out.println();
        woman.printInfo();

        People people = new Man();
        people.printInfo();
        ((Man)people).list();
        System.out.println();
        people = new Woman();
        people.printInfo();
        ((Woman)people).list();

        func(man);
    }

    private void func(People people) {
        people.printInfo();
    }
}
