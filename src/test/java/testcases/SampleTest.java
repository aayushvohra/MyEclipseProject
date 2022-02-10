package testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {

	@BeforeClass
	public static void setUpTestEnv()
	{
		System.out.println("---------set up Test Env-----------");
	}
	
	
	@Before
	public void setUpMockDataEnv()
	{
		System.out.println("setUp Mock Data env");
	}
			
	@Test
	public void test2()
	{
		System.out.println("test2()");
	}
	@Test
	public void test1()
	{
		System.out.println("test1()");
	}
	
	@After
	public void tearDownMockDataEnv()
	{
		System.out.println("tearDown mock data Env");
	}
	
	@AfterClass
	public static void tearDownTestEnv()
	{
		System.out.println("------------Tear down Test Env------------");
	}
	
}
