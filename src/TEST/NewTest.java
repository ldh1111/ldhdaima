package TEST;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NewTest {
	private sum newSum=new sum();
  @Test
  public void f() {
	  int mysum=newSum.add(1, 2);

	  assertEquals(3,mysum,"Right");
  }
}
