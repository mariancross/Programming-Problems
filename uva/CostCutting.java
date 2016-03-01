/**
 * Problem: 11727 - Cost Cutting
 * URL: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2827
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CostCutting
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(new BufferedOutputStream(System.out));

        int cases = Integer.parseInt(input.readLine());

        int[] salaries = new int[3];
        StringTokenizer stk;

        for (int i = 0; i < cases; i++)
        {
            stk = new StringTokenizer(input.readLine());

            for (int j = 0; j < 3; j++)
            {
                salaries[j] = Integer.parseInt(stk.nextToken());
            }

            Arrays.sort(salaries);
            output.println("Case " + (i + 1) + ": " +salaries[1]);
        }

        output.close();
    }
}
