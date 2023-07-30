
public class week04codingproj {
	
	//1)
	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};	
		
		//1) a.
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("Result: " + result);

		//1) b.
		int[] newAge = new int[ages.length + 1];
		System.arraycopy(ages, 0, newAge, 0, ages.length);
		newAge[newAge.length - 1] = 77; 
		
		//1) c.
		int sumOfAge = 0;
		for (int age : newAge) {
			sumOfAge += age;
		}
		double averageAge = (double) sumOfAge / newAge.length;
		System.out.println("Average Age: " + averageAge);
		    
	//2) 
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
		//2) a. 
		int totalLetters = 0;
		for (String name : names) {
		    totalLetters += name.length();
		}
		double averageLetters = (double) totalLetters / names.length;
		System.out.println("Average number of letters: " + averageLetters);
		
		//2) b.
		String concatenatedNames = "";
		for (String name : names) {
		    concatenatedNames += name + " ";
		}
		System.out.println("Concatenated names: " + concatenatedNames);
		
	//3)
		//Use the index 'array.length - 1'.
		
	//4)
		//Use the index '0'.
		
	//5) 
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
		    nameLengths[i] = names[i].length();
	}
		
	//6) 
		int sumOfNameLengths = 0;
		for (int length : nameLengths) {
		    sumOfNameLengths += length;
		}
		System.out.println("Name length sum: " + sumOfNameLengths);
	 
	}	
	//7) 
	public static String repeatWord(String word, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(word);
		}
		return sb.toString();
	}
		
	//8)
	public static String getFullName(String firstName, String lastName) {
		    return firstName + " " + lastName;
		}
	
	//9)
	public static boolean sumGreaterThan100(int[] arr) {
		    int sum = 0;
		    for (int num : arr) {
		        sum += num;
		    }
		    return sum > 100;
	}
	//10)
	public static double calcAverage(double[] arr) {
		    double sum = 0;
		    for (double num : arr) {
		        sum += num;
		    }
		    return sum / arr.length;
	}
	
	//11)	
	public static boolean firstArrayGreaterThanSecond(double[] arr1, double[] arr2) {
	    	double avgArr1 = calcAverage(arr1);
	    	double avgArr2 = calcAverage(arr2);
	    	return avgArr1 > avgArr2;
	}
	
	//12)
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    return isHotOutside && moneyInPocket > 10.50;
	}
	
	//13)
	public static int largestNumber(int[] arr) {
	    if (arr.length == 0) {
	        return -1;
	    }

	    int largest = 0;
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > arr[largest]) {
	            largest = i;
	        }
	    }

	    return largest;
	}
	
}
