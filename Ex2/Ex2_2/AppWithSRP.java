public class AppWithSRP {
	public static void main(String[] args) {
		System.out.println("Welcome to the Application!");
		// get a pair of values
		PairOfInput pair = PairOfInputProcessor.read(); 
		// check whether the inputs are valid
		if (PairOfInputProcessor.isValid(pair)) {
			
            int firstInt, secondInt;
            firstInt = Integer.parseInt(pair.getFirst());
            secondInt = Integer.parseInt(pair.getSecond());
			//do the mathematical operation
		    int resultAdd = MathOperation.add(firstInt, secondInt);
				int resultDelete = MathOperation.delete(firstInt, secondInt);
			System.out.println("The adding result is: " + resultAdd);
			System.out.println("The deleting result is: " + resultDelete);
        }
        else {
            System.out.println("Invalid number");
        }
		
		System.out.println("End of the application!");
	}
	
}
