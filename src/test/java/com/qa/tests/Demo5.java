package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class Demo5 
{
    @Test
    public void sum(){
    	System.out.println("sum method");
    	System.out.println("new change");
    	
    	int a=10;
    	int b=20;
    	Assert.assertEquals(30, a+b);
    }
   
}
