/*
 You are given an integer, N. Write a program to determine if N is an element of the Fibonacci Sequence.

The first few elements of fibonacci sequence are 0,1,1,2,3,5,8,13.... A fibonacci sequence is one where every element is a sum of the previous two elements in the sequence. The first two elements are 0 and 1.

Formally:

fib0 = 0 
fib1 = 1 
fibn = fibn-1 + fibn-2 ∀ n > 1

Input Format 
The first line contains T, number of test cases. 
T lines follows. Each line contains an integer N.

Output Format 
Display IsFibo if N is a fibonacci number and IsNotFibo if it is not a fibonacci number. The output for each test case should be displayed on a new line.

Constraints 
1 <= T <= 105 
1 <= N <= 1010

Sample Input

3
5
7
8
Sample Output

IsFibo
IsNotFibo
IsFibo
Explanation 
5 is a Fibonacci number given by fib5 = 3 + 2 
7 is not a Fibonacci number 
8 is a Fibonacci number given by fib6 = 5 + 3
 */
package com.hackerrank;

import java.util.HashSet;
import java.util.Scanner;

public class IsFibo {
	private static final HashSet<Long> fiboSeries = new HashSet<Long>();

	private static final long MAX = 10000000000l;

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t = 0; t < T; t++) {
			long number = in.nextLong();
			if (fiboSeries.contains(number)) {
				System.out.println("IsFibo");
			} else {
				System.out.println("IsNotFibo");
			}
		}
		in.close();
	}

	static {
		long fibo1 = 1, fibo2 = 1, fibonacci = 1;
		fiboSeries.add(fibo1);
		fiboSeries.add(fibo1);
		for (long i = 3; i <= MAX; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
			if (fibonacci > MAX) {
				break;
			}
			fiboSeries.add(fibonacci);
		}
	}
}
