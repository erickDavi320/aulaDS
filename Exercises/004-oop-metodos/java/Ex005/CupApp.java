import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CupApp extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JPanel panel;
    private JLabel labelNome, labelIdade;
    private JTextField campoNome, campoIdade;
    private JTextArea areaResultados;
    private JButton botaoCadastrar, botaoExibir;
    private ArrayList<Pessoa> pessoas;

    public CupApp() {
        super("Cadastro Único de Pessoas (CUP)");

        pessoas = new ArrayList<>();

        panel = new JPanel();
        panel.setLayout(null);

        labelNome = new JLabel("Nome:");
        labelNome.setBounds(20, 20, 80, 25);
        panel.add(labelNome);

        campoNome = new JTextField(20);
        campoNome.setBounds(100, 20, 265, 25);
        panel.add(campoNome);

        labelIdade = new JLabel("Idade:");
        labelIdade.setBounds(20, 50, 80, 25);
        panel.add(labelIdade);

        campoIdade = new JTextField(3);
        campoIdade.setBounds(100, 50, 50, 25);
        panel.add(campoIdade);

        botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(20, 80, 170, 30);
        botaoCadastrar.addActionListener(this);
        panel.add(botaoCadastrar);

        botaoExibir = new JButton("Exibir Cadastros");
        botaoExibir.setBounds(195, 80, 170, 30);
        botaoExibir.addActionListener(this);
        panel.add(botaoExibir);

        areaResultados = new JTextArea(10, 20);
        areaResultados.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(areaResultados);
        scrollPane.setBounds(20, 115, 345, 160);
        panel.add(scrollPane);

        getContentPane().add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == botaoCadastrar) {
            String nome = campoNome.getText();
            int idade = Integer.parseInt(campoIdade.getText());
            Pessoa pessoa = new Pessoa();
            pessoa.cadastrarPessoa(nome, idade);
            pessoas.add(pessoa);
            areaResultados.setText("");
            campoNome.setText("");
            campoIdade.setText("");
        } else if (event.getSource() == botaoExibir) {
            areaResultados.setText("");
            for (Pessoa pessoa : pessoas) {
                areaResultados.append(pessoa.apresentar() + "\n\n");
            }
        }
    }

    public static void main(String[] args) {
        new CupApp();
    }

}
