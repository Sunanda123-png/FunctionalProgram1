package com.sunanda;

public class TwoDArray {
    public static void main(String[] args)
    {
        // Array of size 4x3 to hold integers.
        int[][] values =
                {
                        { 11, 12, 13 }, {14, 15, 16 }, { 20, 30, 40 },
                        { 50, 60, 70 }
                };

        // Nested loops to print the array in tabular form.
        for (int row = 0; row < 4; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                System.out.print(values[row][col] + " ");
            }

            System.out.println();    // Print new line.
        }
    }
}
