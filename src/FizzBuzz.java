/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {     // For all integers from 1 - 100 inclusive, iterating up by 1

            // Find out which numbers divide i.
            doFizzBuzz(i);
        }
    }

    public static void doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;      // Creates boolean object if remainder is 0
        boolean divisibleBy5 = i % 5 == 0;      // Creates boolean object if remainder is 0

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {     // && is logical AND operator

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {      // Boolean object divisibleBy3 is True

            System.out.println("Fizz");

        } else if (divisibleBy5) {      // Boolean object divisibleBy5 is True

            System.out.println("Buzz");

        } else {        // Else just print out integer i

            System.out.println(i);

        }
    }
}

// NOTE: Differences with Python/Things specific to Java:
// 1. && represents a Python and/logical and
// 2. For for loops, instead of specifying the value we iterate by/using default "1" value, we use i++
// 3. We need to declare a variable's object type before assigning it a value(eg. boolean divisibleBy3)
// 4. If statements, for loops separate their body from rest of code using {}
// 5. Built-in print function is written as System.out.println
