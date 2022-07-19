package Exercises;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class ResultPlusMinus {

	/*
	 * Complete the 'plusMinus' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void plusMinus(List<Integer> arr) {

		Integer positive = 0;
		Integer negative = 0;
		Integer zeros = 0;

		// Write your code here
		for (Integer i : arr) {
			if (i < 0) {
				negative++;
			} else if (i == 0) {
				zeros++;
			} else {
				positive++;
			}
		}

		double POSITIVE_RATIO = (double) positive / arr.size();
		double NEGATIVE_RATIO = (double) negative / arr.size();
		double ZERO_RATIO = (double) zeros / arr.size();

		System.out.println(String.format("%.6f", POSITIVE_RATIO));
		System.out.println(String.format("%.6f", NEGATIVE_RATIO));
		System.out.println(String.format("%.6f", ZERO_RATIO));

	}

}

public class PlusMinus {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		@SuppressWarnings("unused")
		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		ResultPlusMinus.plusMinus(arr);

		bufferedReader.close();
	}
}