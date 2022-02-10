package testcases;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.customexceptions.InvalidNumberRangeException;
import com.cg.severices.MathService;
import com.cg.severices.MathServiceImpl;

public class MathServiceTestCases {

static MathService mathservice;
	
	@BeforeClass
	public static void setUpTestEnv()
	{
		mathservice=new MathServiceImpl();
	}
	
	@Test(expected =InvalidNumberRangeException.class )
	public void testAddForFirstNumberInvalid() throws InvalidNumberRangeException
	{
		//test case: checking for first no invalid : should raise the excpetion
		int n1=-100,n2=200;
		mathservice.add(n1, n2);
	}
	
	@Test(expected = InvalidNumberRangeException.class)
	public void testAddForSecondNumberInvalid() throws InvalidNumberRangeException
	{
		//test case: checking for second no invalid : should raise the excpetion
		int n1=100,n2=-200;
		mathservice.add(n1, n2);
	}
	
	
	@Test
	public void testAddForBothNumberValid() throws InvalidNumberRangeException
	{
		//TestCase: valid inputs: should return the correct result
		int n1=100,n2=200;
		int expectdresult=300;
		int actualresult=mathservice.add(n1, n2);
		
		Assert.assertEquals(expectdresult, actualresult);
	}
	
	
	
	
	
	
	
	
	
}
