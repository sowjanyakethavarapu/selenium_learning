package testng;

import org.testng.annotations.Test;

public class Group_in_Testcases {
  @Test(groups= {"regression testing","smoke testing"})
  public void testcase() {
	  System.out.println("testcase");
  }
  @Test(groups= {"sanity testing","smoke testing"})
  public void testcase1() {
	  System.out.println("testcase1");
  }
  @Test(groups= {"sanity testing","functional testing"})
  public void testcase2() {
	  System.out.println("testcase2");
  }
}
