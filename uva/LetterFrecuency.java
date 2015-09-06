/**
  * 11577 - Letter Frequency
  * URL: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2624
  */

import java.io.*;

public class LetterFrecuency
{
  private String[] datos;
  private int[] ocurrencias;

  public LetterFrecuency()
  {
    datos = new String[] {"a","b","c","d","e","f","g","h","i","j",
    "k","l","m","n","o","p","q","r","s","t",
    "u","v","w","x","y","z"};

    ocurrencias = new int[datos.length];
  }

  public void leerDatos() throws IOException
  {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    String cadena = buffer.readLine();
    int numCases = Integer.parseInt(cadena);

    while(numCases != 0)
    {
      cadena = buffer.readLine();
      procesar(cadena);
      numCases--;
    }
  }

  public void procesar(String cadena)
  {
    cadena = cadena.toLowerCase();
    String caracter = "";

    for(int i = 0; i < cadena.length(); i++)
    {
      caracter = "" + cadena.charAt(i);

      for(int j = 0; j < datos.length; j++)
      {
        if(datos[j].equals(caracter))
        {
          ocurrencias[j]++;
        }
      }
    }

    int max = ocurrencias[0];

    for(int i = 0; i< ocurrencias.length; i++)
    {
      if(ocurrencias[i] > max)
      {
        max = ocurrencias[i];
      }
    }

    String resultado = "";

    for(int i = 0; i < datos.length; i++)
    {
      if(ocurrencias[i] == max)
      {
        resultado += datos[i];
      }
    }

    System.out.println(resultado);
  }

  public static void main(String[] args) throws IOException
  {
    LetterFrecuency lf = new LetterFrecuency();
    lf.leerDatos();
  }
}
