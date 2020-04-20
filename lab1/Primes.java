public class Primes {
    public static void main(String[] args) { // check from 2 to 100 numbers are they primes or not
        for (int i = 2; i <= 100; i++)
            if (isPrime(i))
                System.out.println("Число " + i + " простое");
    }

    public static boolean isPrime(int n) { // is number prime or not
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
