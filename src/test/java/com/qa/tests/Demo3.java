package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class Demo3 
{
    @Test
    public void sum(){
    	System.out.println("sum method");
    	
    	int a=10;
    	int b=20;
    	Assert.assertEquals(30, a+b);
    }
   
}
