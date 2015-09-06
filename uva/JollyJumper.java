/**
  * 10038 - Jolly Jumpers
  * URL: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=979
  */

import java.io.*;
import java.util.*;

public class JollyJumper
{
  public void leerDatos() throws IOException
  {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String cadena = "";

    while(true)
    {
      cadena = buffer.readLine();

      if(cadena == null)
      {
        break;
      }
      else
      {
        if(procesar(cadena))
        {
          System.out.println("Jolly");
        }
        else
        {
          System.out.println("Not jolly");
        }
      }
    }
  }

  public boolean procesar(String cadena)
  {
    StringTokenizer token = new StringTokenizer(cadena," ");

    int num = Integer.parseInt(token.nextToken());
    long difference = num;

    long[] datos = new long[num];
    boolean[] is = new boolean[num];

    for(int i = 0; i <is.length; i++)
    {
      is[i] = false;
    }

    for(int i = 0; i <datos.length; i++)
    {
      datos[i] = Long.parseLong(token.nextToken());
    }

    for(int i = 1; i < datos.length; i++)
    {
      difference = Math.abs(datos[i] - datos[i - 1]);

      if(difference == 0) return false;

      try
      {
        int pos = (int)(difference);
        is[pos] = true;
      }	
      catch(Exception e)
      {
        return false;
      }
    }

    for(int i = 1; i < is.length; i++)
    {
      if(is[i] == false) return false;
    }

    return true;
  }

  public static void main(String[] args) throws IOException
  {
    JollyJumper jj = new JollyJumper();
    jj.leerDatos();
  }
}
