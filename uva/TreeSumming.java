/**
  * 112 - Tree Summing
  * URL: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=3&page=show_problem&problem=48
  */

import java.io.*;
import java.util.*;

public class TreeSumming
{
  static BufferedReader input;
  static StringTokenizer tk;

  static class ArbolBinario
  { 
    public String toString()
    {
      return this.toString();
    }

    public boolean isEmpty()
    {
      return this.isEmpty();
    }
  }

  static class Empty extends ArbolBinario	
  { 
    public String toString()
    {
      return "empty";
    }

    public boolean isEmpty()
    {
      return true;
    }
  }

  static class Full extends ArbolBinario
  {
    int dato;

    ArbolBinario izq;
    ArbolBinario der;

    public String toString()
    {
      return new String("(arbol " + dato + " " + izq.toString() + " " + der.toString() + ")");
    }

    public boolean isEmpty()
    {
      return false;
    }
  }

  static String leer() throws IOException
  {
    return input.readLine();
  }

  static ArbolBinario construirArbolito()
  {
    String token1 = tk.nextToken();
    String token2 = tk.nextToken();

    if(token1.equals("(") && token2.equals(")"))
    {
      return new Empty();
    }

    Full arbol = new Full();

    arbol.dato = Integer.parseInt(token2);
    arbol.izq = construirArbolito();
    arbol.der = construirArbolito();

    tk.nextToken();

    return arbol;
  }

  static boolean encontrarSolucion(ArbolBinario arbolito, int suma)
  {
    Full full = (Full)arbolito;

    suma -= full.dato;

    if(full.izq.isEmpty() && full.der.isEmpty())
    {
      if(suma == 0) return true; 
      return false;
    }

    if((!full.izq.isEmpty() && encontrarSolucion(full.izq,suma)) || (!full.der.isEmpty() && encontrarSolucion(full.der,suma)))
      return true;
    else
      return false;
  }

  public static void main(String[] args) throws IOException
  {
    input = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    StringBuilder programas = new StringBuilder();

    while(true)
    {
      String cadena = leer();

      if(cadena == null) break;

      cadena = cadena.replace("("," ( ");
      cadena = cadena.replace(")", " ) ");

      programas.append(cadena);
    }

    tk=new StringTokenizer(programas.toString(), " ");

    while(tk.hasMoreTokens())
    {
      int suma = Integer.parseInt(tk.nextToken());

      ArbolBinario arbolito = construirArbolito();

      if(arbolito.isEmpty()) output.println("no");
      else if(encontrarSolucion(arbolito,suma)) output.println("yes");
      else output.println("no");
    }

    output.close();
  }
}
