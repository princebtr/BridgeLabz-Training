//Problem Statement: Stock Span Problem
//For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
//Hint: Use a stack to keep track of indices of prices in descending order.

import java.util.Stack;

public class StockSpanProblem {

    // Method to calculate stock span
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        // First day has span 1
        span[0] = 1;
        stack.push(0);

        // Calculate span for remaining days
        for (int i = 1; i < n; i++) {

            // Pop elements while current price is higher
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, span is i + 1
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }

    // Driver code
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = calculateSpan(prices);

        System.out.println("Stock Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println("\nStock Span:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
