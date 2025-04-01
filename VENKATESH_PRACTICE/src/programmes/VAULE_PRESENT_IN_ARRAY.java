package programmes;

public class VAULE_PRESENT_IN_ARRAY {
	// Java program to check whether
	// an element is present in array or not

	
	    // Function return true if given element
	    // found in array
	    private static void check(int[] arr, int toCheckValue)
	    {
	        // check if the specified element
	        // is present in the array or not
	        // using Linear Search method
	        boolean test = false;
	        for (int element : arr) {
	            if (element == toCheckValue) {
	                test = true;
	                break;
	            }
	        }

	        // Print the result
	        System.out.println("Is " + toCheckValue
	                           + " present in the array: " + test);
	    }

	    public static void main(String[] args)
	    {

	        // Get the array
	        int a[] = { 5, 1, 1, 9, 7, 2, 6, 10 };

	        // Get the value to be checked
	        int ele = 7;

	        // Check if this value is
	        // present in the array or not
	        check( a,ele );
	    }
	    }

