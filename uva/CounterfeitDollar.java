import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class CounterfeitDollar
{
    public static void main(String[] args) throws IOException
    {
        // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input = new BufferedReader(new FileReader("in.txt"));
        PrintWriter output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        StringTokenizer stk;
        HashSet realCoins = new HashSet<String>();
        ArrayList<String[]> possibleCounterfeits = new ArrayList<String[]>();

        int cases = Integer.parseInt(input.readLine());

        while (true)
        {
            String line = input.readLine();

            if (line == null)
            {
                break;
            }

            stk = new StringTokenizer(line);
            String[] tuple = new String[3];

            for (int  i = 0; i < 3; i++)
            {
                tuple[i] = stk.nextToken();
            }

            if (tuple[2].equals("even"))
            {
                for (int i = 0; i < tuple[0].length(); i++)
                {
                    realCoins.add("" + tuple[0].charAt(i));
                    realCoins.add("" + tuple[1].charAt(i));
                }
            }
            else
            {
                possibleCounterfeits.add(tuple);
            }
        }

        for (String[] possibleCounterfeit : possibleCounterfeits)
        {
            String coin = "";
            String weight = possibleCounterfeit[2].equals("up") ? "light" : "heavy";
            output.println(Arrays.toString(possibleCounterfeit));

            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < possibleCounterfeit[i].length(); j++)
                {
                    if (!realCoins.contains("" + possibleCounterfeit[i].charAt(j)))
                    {
                        coin = "" + possibleCounterfeit[i].charAt(j);
                    }
                }
            }

            output.println(coin + " is the counterfeit coin and it is " + weight + ".");
        }

        output.close();
    }
}
