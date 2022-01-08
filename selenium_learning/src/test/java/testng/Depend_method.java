package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depend_method {
  @Test(description="login")
  public void testcase() {
	  System.out.println("testcase");
  }
  @Test(dependsOnMethods="testcase",description="search")
  public void testcase1() {
	  Assert.assertEquals("abc", "xyz");
	  System.out.println("testcase1");
  }
  @Test(dependsOnMethods="testcase1",description="submit")
  public void testcase2() {
	  System.out.println("testcase2");
  }
}
