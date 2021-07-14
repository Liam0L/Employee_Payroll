//main class for initializing a partsworker object
package payroll;

public class PartsWorkerMain {

	public static void main(String[] args) {
	
		//Create new PartsWorker object.
		//Arguments to be passed in the format:
		//("FirstName", "LastName", "SSN", "Payment Per Piece", "Number of Pieces", "Pieces Required for Bonus")
		
		PartsWorker partsWorker = new PartsWorker("Liam", "Lynch", "123-32-1234", 20.00, 22, 50);
		
		//Display partsworker
		System.out.println(partsWorker.toString());

	}

}
