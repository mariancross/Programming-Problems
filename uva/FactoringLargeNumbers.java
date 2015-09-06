/**
  * 10392 - Factoring Large Numbers
  * URL: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1333
  */

import java.io.*;

public class FactoringLargeNumbers
{
  static BufferedReader input;
  static PrintWriter output;

  static long read() throws IOException
  {
    return Long.parseLong(input.readLine());
  }

  public static void main(String[] args) throws IOException
  {
    input = new BufferedReader(new InputStreamReader(System.in));		
    output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    int it = 0;

    while(true)
    {
      long number = read();

      if(number < 0) break;

      if(it != 0) output.println();

      long i = 2;

      while(i < Math.sqrt(number))
      {
        if(number % i == 0)
        {
          number /= i;
          output.println(i);
        }
        else
        {
          i++;
        }
      }

      if(number != 1) output.println(number);

      it++;
    }

    output.close();
  }
}
