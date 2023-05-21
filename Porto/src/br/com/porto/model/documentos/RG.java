package br.com.porto.model.documentos;

public class RG {

    private int numero_rg;
    private String estado_emissor;
    private String orgao_emissor;
    private String data;

    public int getNumero_rg() {
        return numero_rg;
    }

    public void setNumero_rg(int numero_rg) {
        this.numero_rg = numero_rg;
    }

    public String getEstado_emissor() {
        return estado_emissor;
    }

    public void setEstado_emissor(String estado_emissor) {
        this.estado_emissor = estado_emissor;
    }

    public String getOrgao_emissor() {
        return orgao_emissor;
    }

    public void setOrgao_emissor(String orgao_emissor) {
        this.orgao_emissor = orgao_emissor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public RG(int numero_rg, String estado_emissor, String orgao_emissor, String data) {
        this.numero_rg = numero_rg;
        this.estado_emissor = estado_emissor;
        this.orgao_emissor = orgao_emissor;
        this.data = data;
    }

    @Override
    public String toString() {
        return "RG{" +
                "numero_rg=" + numero_rg +
                ", estado_emissor='" + estado_emissor + '\'' +
                ", orgao_emissor='" + orgao_emissor + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
