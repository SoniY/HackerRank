/*
Given N integers, count the number of pairs of integers whose difference is K.

Input Format 
The 1st line contains N & K (integers). 
The 2nd line contains N numbers of the set. All the N numbers are distinct.

Output Format 
An integer that tells the number of pairs of integers whose difference is K.

Constraints: 
N <= 105 
0 < K < 109 
Each integer will be greater than 0 and at least K smaller than 231-1

Sample Input #00:

5 2  
1 5 3 4 2  
Sample Output #00:

3
Sample Input #01:

10 1  
363374326 364147530 61825163 1073065718 1281246024 1399469912 428047635 491595254 879792181 1069262793 
Sample Output #01:

0
 */
package com.hackerrank;

import java.util.Scanner;
import java.util.TreeSet;

public class Pairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int diff = in.nextInt();

		if (isInRange(0, 100000, N) && isInRange(0, 1000000000, diff)) {
			TreeSet<Integer> values = new TreeSet<Integer>();
			for (int i = 0; i < N; i++) {
				values.add(in.nextInt());
			}

			int cnt = 0;
			for (Integer val : values) {
				int pair = val - diff;
				if (values.contains(pair)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		in.close();
	}

	private static boolean isInRange(int min, int max, int val) {
		return (val >= min && val <= max);
	}
}
