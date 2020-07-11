package com.halodoc.testCases;

import org.testng.annotations.Test;

import com.halodoc.base.BaseClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Logintests extends BaseClass 
{
  @Test
  public void verifyLogin() 
  {
	  System.out.println("nothing");
  }
  
  
  @BeforeTest
  public void beforeTest() 
  {
	  initialization();
	  
  }
  

  @AfterTest
  public void afterTest() 
  {
	  //driver.quit();
  }

}
