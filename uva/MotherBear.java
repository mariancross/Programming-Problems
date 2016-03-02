/**
 * Problem: 10945 - Mother bear
 * URL: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1886
 */

import java.io.*;
import java.util.StringTokenizer;

public class MotherBear
{
    public static void main(String[] args) throws IOException
    {
        //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input = new BufferedReader(new FileReader("in.txt"));
        PrintWriter output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while (true)
        {
            String line = input.readLine();

            if (line.equals("DONE"))
            {
                break;
            }

            StringTokenizer stk = new StringTokenizer(line.toLowerCase(), " .,!?");
            StringBuilder sbl = new StringBuilder();

            while (stk.hasMoreTokens())
            {
                sbl.append(stk.nextToken());
            }

            String word = sbl.toString();
            boolean palindrome = true;

            for (int i = 0, j = word.length() - 1; i < word.length(); i++, j--)
            {
                if (word.charAt(i) != word.charAt(j))
                {
                    output.println("Uh oh..");
                    palindrome = false;
                    break;
                }
            }

            if (palindrome)
            {
                output.println("You won't be eaten!");
            }
        }

        output.close();
    }
}
