package pgm1.pgm1;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ResultTest {
	
	@Test
	public void testPass() {
		Assert.assertEquals(Result.display(55), "pass");
	}
	@Test
	public void testFail() {
		Assert.assertEquals(Result.display(35), "fail");
	}
	@Test
	public void TestPass() {
		Assert.assertEquals(Result.display(515), "invalid");
	}
}
