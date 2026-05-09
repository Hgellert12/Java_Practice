package dev.practice.exercises;

public class Exercise07 {

    public static void run() {
        printRangeSummary(1, 5);
        printRangeSummary(5, 1);
    }

    public static void printRangeSummary(int start, int end) {
        // TODO: Print all numbers, even count, odd count, sum, and average.
        int oddCount = 0;
        int evenCount = 0;
        int sum = 0;
        if (start > end)
        {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i<=end; i++)
        {
            System.out.println(i);
            sum+=i;
           switch (i%2)
           {
               case 0:
                   evenCount++;
                   break;
               case 1:
                   oddCount++;
                   break;
           }
        }
        double average = sum/(end-start+1);
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}
