import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

    public static BufferedReader in;

    public static void main(String[] args) throws IOException, InterruptedException {

        // Declaração de Utilitarios
        in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Seja bem-vindo(a) ao Sistema CUP (Cadastro Unico de Pessoas)");
        System.out.println("Você pode cadastrar N pessoas, basta informar o nome e a idade. =)");
        System.out.println("--------------------------------------------------------------------");

        while (true) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = in.readLine();
            System.out.print("Agora digite a idade do " + nome.split(" ")[0] + ": ");

            Integer idade;
            while (true) {
                String line = in.readLine();
                try {
                    idade = Integer.parseInt(line);
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Apenas números são aceitos! Tente novamente: ");
                }
            }

            System.out.print("Aguarde um momento");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500);
                System.out.print(".");
            }
            System.out.print("\n");

            Pessoa pessoa = new Pessoa();
            pessoa.cadastrarPessoa(nome, idade);

            // Adiciona o Objeto pessoa à ArrayList pessoas
            pessoas.add(pessoa);

            System.out.println("Sucesso!\n");
            Thread.sleep(500);
            System.out.print("Deseja cadastrar mais um usuário? [S/n] ");


            if (!yesOrNo(in)) {
                break;
            }

            System.out.println();
        }

        System.out.print("\nVocê quer visualizar a apresentação de todos os usuários? [S/n] ");

        if (yesOrNo(in)) {

            for (Pessoa pessoa : pessoas) {
                System.out.println("\n--------- Pessoa " + (pessoas.indexOf(pessoa) + 1) + " ---------");
                System.out.println(pessoa.apresentar());
                System.out.println("--------- Pessoa " + (pessoas.indexOf(pessoa) + 1) + " ---------");
            }

        }

        System.out.println("\nObrigado por utilizar o CUP!");
    }

    public static boolean yesOrNo(BufferedReader in) throws IOException {
        while (true) {
            char res = in.readLine().toLowerCase().charAt(0);
            if (res != 's' && res != 'n') {
                System.out.print("Opção Inválida. Tente novamente: ");
            } else {
                return res == 's';
            }
        }
    }
}
