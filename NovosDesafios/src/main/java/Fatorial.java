import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int z;
        z = input.nextInt();
        if (z < 13) {
            int y = 1;
            int fatorial = z;
            int n = z;
            while (z > 1) {
                fatorial = fatorial * (z - 1);
                z--;
            }


            System.out.println("O fatorfial de " + n + " é " + fatorial);
        }


        input.close();
    }

}
