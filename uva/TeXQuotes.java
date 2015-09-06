/**
  * 272 - TEX Quotes
  * URL: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=208
  */

import java.io.*;

public class TeXQuotes 
{
  private int it;

  public TeXQuotes()
  {
    it = 0;
  }

  public void leerDatos() throws IOException
  {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    String cadena = "";

    while(true)
    {
      cadena = buffer.readLine();

      if(cadena == null) break;
      else operar(cadena);
    }
  }

  public void operar(String cadena)
  {
    String resultado = "";

    for(int i = 0; i < cadena.length(); i++)
    {
      if(cadena.charAt(i) == '"')
      {
        if(it % 2 == 0)
        {
          resultado += "``";
        }
        else
        {
          resultado += "''";
        }

        it += 1;
      }
      else
      {
        resultado += cadena.charAt(i);
      }
    }

    System.out.println(resultado);
  }

  public static void main(String[] args) throws IOException
  {
    TeXQuotes tq = new TeXQuotes();
    tq.leerDatos();
  }
}
