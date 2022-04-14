import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Problem Statement Link: https://www.hackerrank.com/challenges/a-very-big-sum/problem
Problem Statement: 
In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

Function Description
Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
aVeryBigSum has the following parameter(s):
int ar[n]: an array of integers .
Return
int: the sum of all array elements
Input Format
The first line of the input consists of an integer .
The next line contains  space-separated integers contained in the array.
Output Format
Return the integer sum of the elements in the array.
Constraints
Sample Input
5
1000000001 1000000002 1000000003 1000000004 1000000005
Output
5000000015
Note:
The range of the 32-bit integer is .
When we add several integer values, the resulting sum might exceed the above range. You might need to use long int C/C++/Java to store such sums.
Solution:
All test cases passed.
*/
public class App {
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum = sum + ar.get(i);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int arr[] = new int[n];
        // long total = 0;
        // for (int arr_i = 0; arr_i < n; arr_i++) {
        // arr[arr_i] = in.nextInt();
        // total += arr[arr_i];
        // }
        // System.out.println(total);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(br.readLine().trim());

        List<Long> ar = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(Collectors.toList());

        long result = App.aVeryBigSum(ar);
        bw.write(String.valueOf(result));
        bw.newLine();

        br.close();
        bw.close();

    }

}
