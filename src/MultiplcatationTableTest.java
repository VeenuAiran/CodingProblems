import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;


public class MultiplcatationTableTest {

	MultiplicationTableOfPrimeNos PrimeNosTable_Obj = new MultiplicationTableOfPrimeNos();
	
	@Test
	public void testHappyPathCase(){
	assertEquals(PrimeNosTable_Obj.getPrimeNos(10), "Prime Nos Found");
		
	}
	@Test
	public void getMultiplicationTableHappyPathTest(){	
	
	assertTrue(PrimeNosTable_Obj.getMultiplicationTable(3));
		
	}
	
	//Test when ArrayList of Prime Nos passed as an argument 
	
	@Test
	public void testHappyPathCase2(){
		
		assertTrue(PrimeNosTable_Obj.getMultiplicationTable(MultiplicationTableOfPrimeNos.primeNos));
	}
	
	@Test
	public void NonPrimeTestCase(){
		assertFalse(PrimeNosTable_Obj.getMultiplicationTable(6));
	}
	
	@Test 
	public void NegativeCaseNonPrimeNumberTest(){
		assertFalse(PrimeNosTable_Obj.getMultiplicationTable(1));
	}
	
	
	@Test
	public void NegativeValueTest(){
		
		assertFalse(PrimeNosTable_Obj.getMultiplicationTable(-1));
	}
	
	@Test
	public void MinimumValueTest(){
		
		assertFalse(PrimeNosTable_Obj.getMultiplicationTable(Integer.MIN_VALUE));
		
	}
	
	@Test
	public void MaximumValueTest(){
		assertFalse(PrimeNosTable_Obj.getMultiplicationTable(Integer.MAX_VALUE));
	}
}
