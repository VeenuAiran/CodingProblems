
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;


public class PrimeNumberTests  {

	MultiplicationTableOfPrimeNos primeNosw = new MultiplicationTableOfPrimeNos();
	
	
	@Test
	public void testHappyPathCase(){
	assertEquals(primeNosw.getPrimeNos(10), "Prime Nos Found");
		
	}
	
	@Test
	public void testListSize(){
		assertTrue(MultiplicationTableOfPrimeNos.primeNos.size()==10);
	}
	
	@Test
	public void testNegativeCaseZero(){
		
		//GetFirstPrimeNos returns first n numbers of prime Nos. 
	assertEquals(primeNosw.getPrimeNos(0), "Invalid number");
	
	}
	
	@Test
	public void testNegativeInput(){
	assertEquals(primeNosw.getPrimeNos(-1) ,"Invalid number");
	//Maximum Value
	}
	
	@Test
	public void testMinimum(){
	
	//assertEquals(primeNosw.getFirstTenPrimeNos(Integer.MAX_VALUE) , Integer.MAX_VALUE+"Number of Prime found");
	//Minimum Value
	assertEquals(primeNosw.getPrimeNos(Integer.MIN_VALUE) ,"Invalid number");
	
	}
	
	
	

	
	
}
