package Exercises;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class ResultMiniMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    	
    	Collections.sort(arr);
    	
    	long minimum = 0;
    	long maximum = 0;
    	
    	for(int i = 0; i < 4; i++) {
    		minimum += arr.get(i);
    	}
    	
    	for(int i = 4; i > 0; i--) {
    		maximum += arr.get(i);
    	}
    	
    	System.out.println(minimum + " " + maximum);
    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        ResultMiniMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}
