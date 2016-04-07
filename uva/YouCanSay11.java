/**
 * Problem: 10929 - You can say 11
 * URL: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1870
 */

import java.io.*;

public class YouCanSay11
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while (true)
        {
            String line = input.readLine();

            if (line.equals("0"))
            {
                break;
            }

            int value = 0;
            int digit = 0;
            
            for (int i = line.length() -1; i >= 0; i--)
            {
                digit = Integer.parseInt("" + line.charAt(i));
                
                if (i % 2 == 0)
                {
                    value += digit;
                }
                else
                {
                    value -= digit;
                }
            }

            if (value % 11 == 0)
            {
                output.println(line + " is a multiple of 11.");
            }
            else
            {
                output.println(line + " is not a multiple of 11.");
            }
        }

        output.close();
    }
}
