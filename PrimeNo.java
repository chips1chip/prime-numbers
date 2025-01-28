public class PrimeNo {
    // Function to check if a number is prime
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // Number is prime if no divisors found
    }

    public static void main(String[] args) {
        // Array of numbers to check for primality
        int[] numbers = {2, 3, 4, 5, 16, 17, 18, 19, 20};
        
        // Loop through each number and check if it's prime
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " is prime: " + checkPrime(numbers[i]));
        }
    }
}
