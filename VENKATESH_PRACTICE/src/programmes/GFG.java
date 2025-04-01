package programmes;

public class GFG {

	static void Fibonacci(int N)
	//This method prints the first N numbers of the Fibonacci sequence using an iterative approach (loop)
    {
        int num1 = 0, num2 = 1;
        //num1 = 0 (First Fibonacci number)
      //  num2 = 1 (Second Fibonacci number)

        for (int i = 0; i < N; i++) {
        	
            // Print the number
            System.out.print(num1 + " ");
            
//A loop runs N times to generate Fibonacci numbers.
        //    Prints the current Fibonacci number (num1).
            
            
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            
            //Calculates the next Fibonacci number (num3).
         //   Updates num1 and num2 for the next iteration
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 9;

        // Function Call
        Fibonacci(N);
    }
}

