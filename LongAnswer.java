public static boolean productOfTwoPrimes(int num){
	for (int firstPrime=3; firstPrime<num); firstPrime++){
		if (num%i == 0 && isPrime(firstPrime)){ 
			int quotient = num/firstPrime;
			if isPrime(quotient) return true;
		}
	}
	return false;
}

public static int secondLargest secondLargest(int[] arr){
	// find the index of the largest integer
	int largest = arr[0];
	for (int i=1; i<arr.length; i++){
		if (arr[i] > largest){
			largest = arr[i];
		}
	}
	// find the second largest integer, ignoring the largest integer
	int secondLargest = Integer.MIN_VALUE;
	for (int i=0; i<arr.length; i++){
		if (arr[i] > secondLargest && arr[i] < largest){
			secondLargest = arr[i];
		}
	}
	return secondLargest;
}