import br.com.porto.model.Print_geral.Geral;
import br.com.porto.model.bike.Info_Bikes;
import br.com.porto.model.pessoa.Pessoa;
import br.com.porto.model.Endereco.Endereco;
import br.com.porto.model.documentos.RG;

import javax.swing.*;

import static java.lang.System.exit;


public class Main {
    public static void main(String[] args) {


        Pessoa pessoa;
        Info_Bikes info_bikes;
        RG rg;
        Endereco endereco;
        Geral geral;

        int terminar = 0;


    do{

        JOptionPane.showMessageDialog(null, "Digite as informaçoes de seus documentos");
        var numero_rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do seu RG"));
        var estado_emissor = JOptionPane.showInputDialog(null, "Digite o estado emissor");
        var orgao_emissor = JOptionPane.showInputDialog(null, "Digite o Orgão emissor");
        var data = JOptionPane.showInputDialog(null,"Digite a data da realização");

        rg = new RG(numero_rg, estado_emissor, orgao_emissor, data);
        String validacao_rg = String.format("Verifique os dados do seu documento, %d,%s,%s,%s", numero_rg, estado_emissor, orgao_emissor,data);
        JOptionPane.showMessageDialog(null,validacao_rg);

        JOptionPane.showMessageDialog(null,"complete com os seus dados pessoais ");
        var nome = JOptionPane.showInputDialog("digite o seu Nome");
        var idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        if (idade <18) {
            JOptionPane.showMessageDialog(null, "Infelizmente apenas vistoria para maiores de idade ");
            exit(0);
        }
        var cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu Cpf"));
        var telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu Telefone"));

        pessoa = new Pessoa(nome, idade, cpf, telefone);
        String Validacao = String.format("Verifique se os seus dados estao certos por favor, %s, %d, %d, %d", nome, idade, cpf, telefone);
        JOptionPane.showMessageDialog(null,Validacao);


        JOptionPane.showMessageDialog(null, "Digite os dados do seu Endereço");
        var cep = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu Cep"));
        var rua = JOptionPane.showInputDialog(null, "Digite a sua rua");
        var cidade = JOptionPane.showInputDialog(null, "Digite a sua cidade");
        var bairro = JOptionPane.showInputDialog(null,"Digite o seu bairro");
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sua casa"));
        var complemento = JOptionPane.showInputDialog(null,"Digite algum complemento");

        endereco = new Endereco(cep, rua, cidade, bairro, numero, complemento);
        String validada_endereco = String.format("Verifique os dados do seu Endereço, %d, %s, %s, %s, %d, %s", cep, rua,cidade,bairro,numero,complemento);
        JOptionPane.showMessageDialog(null, validada_endereco);


        var marca_bike = JOptionPane.showInputDialog("Digite a marca da sua bike");
        var ano_bike = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da sua bike"));
        var valor_bike = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua bike"));
        var utl_bike = JOptionPane.showInputDialog("Digite a utilidade da sua bike");
        var tipo_bike = JOptionPane.showInputDialog("Digite o tipo da sua bike");


        info_bikes = new Info_Bikes(marca_bike,ano_bike,valor_bike,utl_bike,tipo_bike);
        String Validacao_bike = String.format("Verifique se os seus daods estao certos por favor, %s, %d, %.2f, %s, %s", marca_bike, ano_bike, valor_bike, utl_bike, tipo_bike);
        JOptionPane.showMessageDialog(null, Validacao_bike);


        Geral geral1 = new Geral();
        geral1.setEndereco(endereco);
        geral1.setPessoa(pessoa);
        geral1.setRg(rg);
        geral1.setInfo_bikes(info_bikes);
        JOptionPane.showMessageDialog(null, geral1);


        var pergunta = """
                         Caso deseja encerrar digite 1. 
                         Caso deseja fazer mais uma vistoria digite 2.
                               
                    """;
        terminar = Integer.parseInt(JOptionPane.showInputDialog(pergunta
        ));

    }while (terminar > 1);



    }
}