/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) { //difference: public static void

        for (int i = 1; i < 100; i++) { // for i in range(100):
            doFizzBuzz(i);
        }
    }

    public static void doFizzBuzz(int i) {
        //has i++ in the for loop initialization

        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        //specifies type of output (boolean), then defines the method in the same line
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}

/*
python methods:
def divisible_by_3(i: int):
    return i % 3 == 0

def divisible_by_5(i: int):
    return i % 5 == 0
*/

/*
So for the for-loop version
for i in range(100):
    if divisible_by_3(i) and divisible_by_5(i):
        print("Fizz Buzz")
    else if divisible_by_3(i):
        print("Fizz")
    else if divisible_by_5(i):
        print("Buzz")
    else:
        print(i)
 */

/*
And for the while-loop version
i = 1
while i < 100:
if divisible_by_3(i) and divisible_by_5(i):
    print("Fizz Buzz")
else if divisible_by_3(i):
    print("Fizz")
else if divisible_by_5(i):
    print("Buzz")
else:
    print(i)
i++
 */
