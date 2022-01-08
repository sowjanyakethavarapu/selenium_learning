package testng;

import org.testng.annotations.Test;

public class priority {
  @Test(priority=2)
  public void testcase() {
	  System.out.println("testcase");
  }
  @Test(priority=3)
  public void testcase1() {
	  System.out.println("testcase1");
  }
  @Test(priority=1)
  public void testcase2() {
	  System.out.println("testcase2");
  }
}
