/**
  * 579 - Clock Hands
  * URL: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=520
  */

import java.io.*;
import java.util.*;

public class ClockHands 
{
  static BufferedReader buffer;
  static StringTokenizer tk;

  public static String leer() throws IOException
  {
    String cadena = buffer.readLine();

    if(cadena != null)
    {
      tk = new StringTokenizer(cadena, ":");
    }

    return cadena;
  }

  public static String next()
  {
    return tk.nextToken();
  }

  public static double nextDouble()
  {
    return Double.parseDouble(next());
  }

  public static void main(String[] args) throws IOException
  {
    buffer = new BufferedReader(new InputStreamReader(System.in));

    String cadena = "";

    while(true)
    {
      cadena = leer();

      if(cadena.equals("0:00")) break;

      double gradoHora = 30.0 * nextDouble();
      double gradoMin = 6.5 * nextDouble();

      double angulo = Math.abs(gradoHora - gradoMin );

      while(angulo >= 360.0) angulo -= 360.0;	    
      while(angulo >= 180.0) angulo -= 180.0;

      System.out.println(angulo);
    }
  }
}
