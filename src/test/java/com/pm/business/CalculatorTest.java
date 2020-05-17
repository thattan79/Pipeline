package com.pm.business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class CalculatorTest {

    @InjectMocks
    private Calculator calculator;

    @Test
    public void sum() {
        assertEquals(2, calculator.sum(1, 1));
    }
}
