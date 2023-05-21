package br.com.porto.model.Print_geral;

import br.com.porto.model.Endereco.Endereco;
import br.com.porto.model.bike.Info_Bikes;
import br.com.porto.model.documentos.RG;
import br.com.porto.model.pessoa.Pessoa;

public class Geral {
    private Endereco endereco;
    private RG rg;
    private Pessoa pessoa;
    private Info_Bikes info_bikes;

    public Geral() {
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public RG getRg() {
        return rg;
    }

    public void setRg(RG rg) {
        this.rg = rg;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Info_Bikes getInfo_bikes() {
        return info_bikes;
    }

    public void setInfo_bikes(Info_Bikes info_bikes) {
        this.info_bikes = info_bikes;
    }

    @Override
    public String toString() {
        return "Geral{" +
                "endereco=" + endereco +
                ", rg=" + rg +
                ", pessoa=" + pessoa +
                ", info_bikes=" + info_bikes +
                '}';
    }
}
