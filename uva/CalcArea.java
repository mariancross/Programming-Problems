/**
  * Calc Area
  */

import java.io.*;
import java.util.*;

public class CalcArea
{
  static BufferedReader input;
  static StringTokenizer tk;

  static String read() throws IOException
  {
    String line = input.readLine();

    if(line != null) tk = new StringTokenizer(line, " ");

    return line;
  }

  static String next()
  {
    return tk.nextToken();
  }

  static int nextInt()
  {
    return Integer.parseInt(next());
  }

  public static void main(String[] args) throws Exception
  {
    input = new BufferedReader(new InputStreamReader(System.in));

    PrintWriter output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    String line = read();

    int n = Integer.parseInt(line);

    Integer[] polx = new Integer[n];
    Integer[] poly = new Integer[n];

    for(int i = 0; i < n; i++)
    {
      read();

      polx[i] = nextInt();
      poly[i] = nextInt();
    }

    long area = 0;

    for(int i = 1; i < polx.length; i++)
    {
      area += (polx[i - 1] * poly[i] - polx[i] * poly[i - 1]);
    }

    output.println((int) Math.ceil(area / 2));
    output.close();
  }
}
