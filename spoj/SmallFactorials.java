/**
  * Problem: FCTRL2 - Small factorials
  * URL: http://www.spoj.com/problems/FCTRL2/
  */

import java.io.*;
import java.math.*;

public class SmallFactorials
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
      int value = Integer.parseInt(read());

      BigInteger factorial = new BigInteger("" + 1);

      for(int j = value; j >= 1; j--)
      {
        factorial = factorial.multiply(new BigInteger("" + j));
      }

      output.println(factorial);
    }

    output.close();
  }
}
