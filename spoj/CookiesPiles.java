/**
  * Problem: 8060. Cookies Piles
  * Code: AMR10F
  * URL: http://www.spoj.com/PUJ2011/problems/AMR10F/
  */

import java.io.*;
import java.util.*;

public class CookiesPiles
{
  static BufferedReader input;
  static PrintWriter output;

  static StringTokenizer tk;

  static String read() throws IOException
  {
    String line=input.readLine();

    if(line != null) tk=new StringTokenizer(line," ");

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

  public static void main(String[] args) throws IOException
  {
    input = new BufferedReader(new InputStreamReader(System.in));
    output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    int cases = Integer.parseInt(read());

    for(int i = 0; i < cases; i++)
    {
      read();

      int n = nextInt();
      int a = nextInt();
      int d = nextInt();

      int cookies[] = new int[n];

      cookies[0] = a;

      long totalCookies = cookies[0];

      for(int j = 1; j < cookies.length; j++)
      {
        cookies[j] = cookies[j - 1] + d;
        totalCookies += cookies[j];
      }

      output.println(totalCookies);
    }

    output.close();
  }
}
