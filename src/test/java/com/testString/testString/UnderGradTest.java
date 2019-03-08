package com.testString.testString;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class UnderGradTest {

    private loanInterest loanInt;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        loanInt = (loanInterest)ctx.getBean("loan");
    }

    @After
    public void tearDown()
    {

    }

    @Test
    public void testUnderGrad() throws Exception
    {
        double result = loanInt.interest();
        assertEquals(600, result, 1);
    }


}
