
//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}

class FractionalKnapSack {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputLine[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int w = Integer.parseInt(inputLine[1]);
        Item[] arr = new Item[n];
        inputLine = br.readLine().trim().split(" ");
        for (int i = 0, k = 0; i < n; i++) {
            arr[i] = new Item(Integer.parseInt(inputLine[k++]),
                    Integer.parseInt(inputLine[k++]));
        }
        System.out.println(
                String.format("%.6f", new Solution().fractionalKnapsack(w, arr, n)));

    }
}
// } Driver Code Ends

/*
 * class Item {
 * int value, weight;
 * Item(int x, int y){
 * this.value = x;
 * this.weight = y;
 * }
 * }
 */

class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
        // Your code here
        Arrays.sort(arr, (i1, i2) -> i2.value * i1.weight - i2.weight * i1.value);
        double res = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i].weight <= w){
                res += arr[i].value;
                w -= arr[i].weight;
            }
            else{
                res += (double)arr[i].value * (double) w / (double) arr[i].weight;
                break;
            }
        }
        
        return res;
    }
}
