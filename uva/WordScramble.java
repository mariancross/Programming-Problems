/**
  * Problem: 483 - Word Scramble
  * URL: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=424
  */

import java.io.*;
import java.util.*;

public class WordScramble
{
  public void leerDatos() throws IOException
  {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String cadena = "";

    while(true)
    {
      cadena = buffer.readLine();

      if(cadena == null) break;

      procesar(cadena);
    }
  }

  public void procesar(String cadena)
  {
    StringTokenizer tokens = new StringTokenizer(cadena," ");
    String resultado = "";

    int it = 0;

    while(it < tokens.countTokens())
    {
      String parte = tokens.nextToken();

      for(int i= parte.length() - 1; i >= 0; i--)
      {
        resultado += parte.charAt(i);
      }

      if(it != tokens.countTokens())
      {
        resultado += " ";
      }
    }

    System.out.println(resultado);
  }

  public static void main(String[] args) throws IOException
  {
    WordScramble ws = new WordScramble();
    ws.leerDatos();
  }
}
