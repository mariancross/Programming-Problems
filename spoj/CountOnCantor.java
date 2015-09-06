/**
  * Problem: CANTON - Count on Cantor
  * URL: http://www.spoj.com/problems/CANTON/
  */

import java.io.*;

public class CountOnCantor
{
  static BufferedReader input;
  static PrintWriter output;

  static String read() throws IOException
  {
    return input.readLine();
  }

  public static void main(String[] args) throws IOException
  {
    input = new BufferedReader(new InputStreamReader(System.in));
    output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    int cases = Integer.parseInt(read());

    for(int i = 0; i < cases; i++)
    {
      int num = Integer.parseInt(read());
      int copy = num;

      int diag = 1;

      while(copy > 0)
      {
        copy -= diag;
        diag++;
      }

      if(copy <= 0) diag--;

      int lastValue=0;

      for(int j = 0; j < diag; j++)
      {
        lastValue += (j + 1);
      }

      int[] pos;

      if(diag % 2 == 1)
      {
        // Up - last position
        pos=new int[] {1, diag};

        while(lastValue > num)
        {
          if(pos[1] != 1)
          {
            pos[0]++;
            pos[1]--;
          }

          lastValue--;
        }
      }
      else
      {
        // down - last position
        pos = new int[] {diag, 1};

        while(lastValue > num)
        {
          if(pos[0] != 1)
          {
            pos[0]--;
            pos[1]++;
          }

          lastValue--;
        }
      }

      output.println("TERM " + num + " IS " + pos[0] + "/" + pos[1]);
    }

    output.close();
  }
}
