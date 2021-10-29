
/**
 * Lab 3: Prime Numbers
 *
 * @author Zayaan Hussain
 * @version .001
 */
public class primeNumbers
{
    public int smallestPrimeFactor (int n) {
        //start at 2

        int d = 2;
        //then go to 3... (and so on while the loop is true)

        while ( n % d != 0) {
            d++;
        }

        return d;
    }

    /**
     * Task 1:
     * 
     * find prime numbers and all recognise which ones are which, for this we are looking
     * for the prime number, so that if I say that the the value is 6, it will find 
     * the 6th prime number, which would write out to be 2, 3, 5, 7, 11, 13. 13
     * would be the answer since it is the 6th prime number. Another example could be,
     * if I ask for the 4 prime number, or what would be written as prime(4), 
     * I would have the value of 7, which could be written out as 2, 3, 5, and the 4 
     * prime number would be 7.
     * 
     */

    public int prime (int i) {
        int primeNumberCount = 0;
        int n = 2;
        while (primeNumberCount != i) {
            if (n == smallestPrimeFactor(n)) {
                primeNumberCount++;
            }
            n++;
        }
        return n - 1;
    }

    /**
     * Task 2:
     * 
     * For this task, we are essentially kind of referenceing the method in 
     * Task one, where we are looking for the amount of prime numbers. For example,
     * if I said primoral (3), I would have 2 * 3 * 5, and I would get a return value
     * of 30. Another example is if I would have primoral (5), It would look like 
     *  2*3*5*7*11 = 2310, (written out work, in reality, I would moreso get the)
     * return value of 2310
     * if the value of the requested primoral value excedes the param, it will just
     * just return the "productSoFar", which is set to one to start. 
     * Param numbers will be 0<= 1 <= 11
     */

    public int primoral (int n) {
        Calculator cal = new Calculator();
        int productSoFar = 1; 
        int currentNumber = 2;
        int primeNumberCount = 0;
        if ( 0<=n && n<=11){
            while (primeNumberCount < n) { 
                if (currentNumber == cal.smallestPrimeFactor(currentNumber)) { // this is going to be the thing saying that if the current number is if the current number is a prime number, 
                    productSoFar *= cal.smallestPrimeFactor(currentNumber);
                    primeNumberCount++;
                    currentNumber++;
                }

                else {
                    currentNumber++;
                }

            }
        }
        return productSoFar;
    }

    /** 
     * Task 3: 
     * 
     * This is a major callback to Task 2, in which we are going to be taking
     * the Primoral of a number (n), and be plugging that into task 2's code, 
     * which will then give us that answer, then we just add one to that value. 
     * if the requested numbers for the value int n exceed the param values set,
     * it will call back to the primoral method. since primoral has the same values
     * it will give the same value as before, which would be one. For this method we
     * have the primoral value + 1. Since it would be giving us one, it would return
     * 1 + 1, which would be equal to 2. 
     * 
     * Param numbers will be 0<= 1 <= 11
     */

    public int eucidNumber (int n) {
        // primeNumbers primoral = new primeNumbers();
        // v = primoral(n) + 1;
        if ( 0<=n && n<=11){ 
        }
        return primoral(n) + 1;


    }
    /** 
     * Task 4: 
     * 
     * This is a callback to task 3, in which we are going to be calling back to it
     * and we will be finding the first n elucid numbers, which will print out each 
     * elucid number for N. We print each one, for example if I had n = 3, i would 
     * have a printed out value of 2+1, 6+1, 30+1, since we would have the first prime 
     * number, then the second one would be 2 * 3 + 1. then it would essentially keep 
     * going like that. 
     */
}
