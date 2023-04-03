import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valorHoraAula, quantidadeAulas,salarioliquido,desconto,valorFinal;

        System.out.print("Informe o valor da hora aula: ");
        valorHoraAula = in.nextDouble();

        System.out.print("Informe a quantidade de aulas dadas: ");
        quantidadeAulas = in.nextDouble();

        salarioliquido = valorHoraAula*quantidadeAulas;

        if(salarioliquido<1212.01){
            desconto = 7.5;
        } else if(salarioliquido<2427.36){
            desconto = 9.0;
        } else if (salarioliquido<3641.04) {
            desconto = 12.0;
        } else if (salarioliquido<7087.23) {
            desconto = 14.0;
        } else if (salarioliquido<12136.80) {
            desconto = 14.5;
        } else if (salarioliquido<24273.58) {
            desconto = 16.5;
        } else if (salarioliquido<47333.48) {
            desconto = 19.0;
        } else{
            desconto = 22.0;
        }

        valorFinal = desconto * salarioliquido/100;

        System.out.println("O valor do salário é: "+(salarioliquido - valorFinal));
        System.out.println("O valor descontado foi de: " + valorFinal);
        System.out.println("Foi descontado " + desconto + "% do salário. :)");
    }
}
