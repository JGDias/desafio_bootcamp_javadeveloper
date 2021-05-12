import java.util.Scanner;

public class desafio_bootcamp_java_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt();

        int num_ele = 0;
        int array[] = new int[N];
        int count = N;
        while (count != 0) {
            int M = ler.nextInt();

            if (num_ele == 0) {
                array[0] = M;
                num_ele++;
                count--;
            } else {
                int x = num_ele - 1;
                while (x >= 0) {
                    if (M > array[x]) {
                        array[x + 1] = array[x];
                    } else {
                        break;
                    }
                    x--;
                }
                array[x + 1] = M;
                num_ele++;
                count--;
            }
        }
        for(int i = array.length - 1; i >= 0; i--)
        {
            if(array[i] % 2 == 0)
            {
                System.out.println(array[i]);
            }
        }
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 != 0)
            {
                System.out.println(array[i]);
            }
        }
        ler.close();
    }
}
