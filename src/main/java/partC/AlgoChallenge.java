package partC;

public class AlgoChallenge {
     /* Problem 22
    A group of students is given an addition worksheet during class to compete against each other.
    The main goal is the find the sum of all the given values; you will be given a set of two numbers.
    The teacher decided to put a twist on the contest by providing one rule.
    Return the sum of two int values; but if the values are the same then return double their sum.
    Example:
    doubleTheSum(1, 2) --> 3
    doubleTheSum(3, 2) --> 5
    doubleTheSum(2, 2) --> 8
     */

    public static Integer doubleTheSum(int a, int b) {
        return (a == b) ? 2 * (a + b) : (a + b);
    }


    /* Problem 23
    Tom's favorite number is ten, and he is on the look-out for the value 10 or the sum 10 out of the values given to him.
    Tom needs you to confirm if any of the values given have what he is looking for.
    Return true if one value is 10 or return true if the sum of both values is 10;
    Example:
    lookOut10(9, 10) --> true
    lookOut10(9, 9) --> false
    lookOut10(1, 9) --> true
     */

    public static Boolean lookOut10(int a, int b) {
        return (a == 10 || b == 10 || (a + b) == 10);
    }

    public static void main(String[] args) {
        System.out.println(AlgoChallenge.doubleTheSum(1, 2));
        System.out.println(AlgoChallenge.doubleTheSum(3, 2));
        System.out.println(AlgoChallenge.doubleTheSum(2, 2));

        System.out.println(AlgoChallenge.lookOut10(9, 10));
        System.out.println(AlgoChallenge.lookOut10(9, 9));
        System.out.println(AlgoChallenge.lookOut10(1, 9));
    }
}
