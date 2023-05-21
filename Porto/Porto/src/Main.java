import br.com.porto.model.info_pessoais;
import br.com.porto.model.info_bike;

import javax.swing.*;

import static java.lang.System.exit;


public class Main {
    public static void main(String[] args) {

    info_pessoais Info_pessoais;
    info_bike Info_bikes;
    int terminar = 0;


    do{
        JOptionPane.showMessageDialog(null,"Iniciando vistoria, complete com os seus dados ");
        var nome = JOptionPane.showInputDialog("digite o seu Nome");
        var idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        if (idade <18) {
            JOptionPane.showMessageDialog(null, "Infelizmente apenas vistoria para maiores de idade ");
            exit(0);
        }
        var cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu Cpf"));
        var telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu Telefone"));
        var cidade = JOptionPane.showInputDialog("digite a sua Cidade");
        var bairro = JOptionPane.showInputDialog("digite o seu Bairro");


        Info_pessoais = new info_pessoais(nome, idade, cpf, telefone, cidade, bairro);
        String Validacao = String.format("Verifique se os seus daods estao certos por favor, %s, %d, %d, %d, %s, %s", nome, idade, cpf, telefone, cidade, bairro);
        JOptionPane.showMessageDialog(null,Validacao);

        var marca_bike = JOptionPane.showInputDialog("Digite a marca da sua bike");
        var ano_bike = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da sua bike"));
        var valor_bike = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua bike"));
        var utl_bike = JOptionPane.showInputDialog("Digite a utilidade da sua bike");
        var tipo_bike = JOptionPane.showInputDialog("Digite o tipo da sua bike");


        Info_bikes = new info_bike(marca_bike,ano_bike,valor_bike,utl_bike,tipo_bike);
        String Validacao_bike = String.format("Verifique se os seus daods estao certos por favor, %s, %d, %.2f, %s, %s", marca_bike, ano_bike, valor_bike, utl_bike, tipo_bike);
        JOptionPane.showMessageDialog(null,Validacao_bike);


        var pergunta = """
                         Caso deseja encerrar digite 1. 
                         Caso deseja fazer mais uma vistoria digite 2.
                               
                    """;
        terminar = Integer.parseInt(JOptionPane.showInputDialog(pergunta
        ));

    }while (terminar > 1);



    }
}