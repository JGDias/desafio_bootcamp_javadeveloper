import java.util.Scanner;
import java.util.*;

public class desafio_bootcamp_java_2 
{

    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        
        int N = ler.nextInt();
        
        for(int i = 0; i <= N; i++)
        {
          
          String lista = ler.nextLine();
          SortedSet<String> ordem =  new TreeSet<String>();
          String[] array = lista.split(" ");
          if(i > 0)
          {
            for(int j = 0; j < array.length; j++)
            {
              ordem.add(array[j]);
            }
            String[] ordenado = ordem.toArray(new String[0]);
            System.out.println(String.join(" ", ordenado));
          }
        }
        ler.close();
    }
}