import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int TAM = 10;

        int a[] = new int[TAM];
        int b[] = new int[TAM];
        int c[] = new int[TAM];

        for (int i=0;i<TAM;i++){
            System.out.println("Informe o "+(i+1)+"º valor do vetor A:");
            a[i] = in.nextInt();
        }
        for (int i=0;i<TAM;i++){
            System.out.println("Informe o "+(i+1)+"º valor do vetor B:");
            b[i] = in.nextInt();
        }
        for (int i=0;i<TAM;i++){
            c[i] = a[i] + b[i];
        }

        System.out.println("Vetor C:");
        for (int num: c) {
            System.out.print(num  + " | ");
        }
    }
}
