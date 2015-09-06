/**
  * Problem: 10055 - Hashmat the Brave Warrior
  * URL: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=996
  */

import java.io.*;
import java.util.*;

public class Hashmat_the_Brave_Warrior
{
  public void leerDatos() throws IOException
  {
    String cadena = "";

    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    while(true)
    {
      cadena = buffer.readLine();

      if(cadena == null) break;

      StringTokenizer tokens = new StringTokenizer(cadena," ");

      long forceOne = Long.parseLong(tokens.nextToken());
      long forceTwo = Long.parseLong(tokens.nextToken());

      System.out.println(Math.abs(forceOne - forceTwo));
    }
  }

  public static void main(String[] args) throws IOException
  {
    Hashmat_the_Brave_Warrior h = new Hashmat_the_Brave_Warrior();
    h.leerDatos();
  }
}
