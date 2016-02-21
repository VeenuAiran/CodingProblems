import java.util.ArrayList;

public class MultiplicationTableOfPrimeNos {

	public static ArrayList<Integer> primeNos = new ArrayList<Integer>();
	boolean success = false;
	
	// This method add Prime Numbers to primeNos ArrayList.
	public String getPrimeNos(int totalNumberofPrimes) {

		//Requested total Number of Primes is 0 or a negative value 
		if(totalNumberofPrimes<0 || totalNumberofPrimes == 0){
			
			return "Invalid number";
			
		}
		int num = 3;
		int status = 1;
		primeNos.add(2);
		for (int i = 2; i <= totalNumberofPrimes;) {
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0) {
				primeNos.add(num);
				i++;
			}
			status = 1;
			num++;	
		}
		return "Prime Nos Found";
		
		
	}

	// This method prints the multiplication table
	public boolean getMultiplicationTable(int primeNumber) {

		
		// Check if parameter v
		if (primeNumber < 0) {

			return success;
		}
		
		//CHeck input Prime Number is present in ArrayList
		
		if(!primeNos.contains(primeNumber)){
			return success;
			
		}
		
		int product = 1;
		for (int i = 1; i <= 10; i++) 
		{
			product = primeNumber * i;
			System.out.print(product + " ");
			product = 1;
		}
		System.out.println();
	
		return success = true;
		}
	
	
	public boolean getMultiplicationTable(ArrayList<Integer> primeNos){
		
		if(primeNos.size() == 0){
			
			return success = false;
		}
		
		for(int i : primeNos){
			success = getMultiplicationTable(i);
			
		}
		return success;
	}

	public static void main(String[] args) {

		MultiplicationTableOfPrimeNos primeNosw = new MultiplicationTableOfPrimeNos();
		 primeNosw.getPrimeNos(10);
		 System.out.println("First 10 Prime Numbers");
		 System.out.println(primeNos.toString());
		 System.out.println("MultiplicationTable of first 10 Prime Numbers :");
		 primeNosw.getMultiplicationTable(primeNos);
		 

		
	}
}
