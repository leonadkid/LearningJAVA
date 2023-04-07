package org.example;

public class CountDiv
{
    public static void main(final String[] args)
    {
        final CountDiv countDiv = new CountDiv();
        countDiv.Solution(6, 11, 2);
    }

    public int Solution(final int a, final int b, final int k)
    {
        int result = b / k - a / k;
        if (a % k == 0) {
            result++;
        }
        return result;
    }
}
