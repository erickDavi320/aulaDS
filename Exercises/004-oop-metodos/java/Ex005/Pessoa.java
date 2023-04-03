public class Pessoa {

    public String nome;
    public Integer idade;

    // falso construtor =)
    public void cadastrarPessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String apresentar() {
        return "Olá! Eu sou o " + nome
                + "\nEu tenho " + idade + " anos de vida!"
                + "\nEu vivi cerca de " + (idade*365) + " dias!";
    }

}
