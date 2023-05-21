package br.com.porto.model;

public class info_bike {

    private String marca_bike;
    private int ano_bike;
    private double valor_bike;
    private String utl_bike;
    private String tipo_bike;

    public String getMarca_bike() {
        return marca_bike;
    }

    public int getAno_bike() {
        return ano_bike;
    }

    public double getValor_bike() {
        return valor_bike;
    }

    public String getUtl_bike() {
        return utl_bike;
    }

    public String getTipo_bike() {
        return tipo_bike;
    }

    public void setMarca_bike(String marca_bike) {
        marca_bike = marca_bike;
    }

    public void setAno_bike(int ano_bike) {
        this.ano_bike = ano_bike;
    }

    public void setValor_bike(double valor_bike) {
        this.valor_bike = valor_bike;
    }

    public void setUtl_bike(String utl_bike) {
        this.utl_bike = utl_bike;
    }

    public void setTipo_bike(String tipo_bike) {
        this.tipo_bike = tipo_bike;
    }

    public info_bike(String marca_bike, int ano_bike, double valor_bike, String utl_bike, String tipo_bike) {
        marca_bike = marca_bike;
        this.ano_bike = ano_bike;
        this.valor_bike = valor_bike;
        this.utl_bike = utl_bike;
        this.tipo_bike = tipo_bike;
    }

    @Override
    public String toString() {
        return "info_bike{" +
                "Marca_bike='" + marca_bike + '\'' +
                ", ano_bike=" + ano_bike +
                ", valor_bike=" + valor_bike +
                ", utl_bike='" + utl_bike + '\'' +
                ", tipo_bike='" + tipo_bike + '\'' +
                '}';
    }
}
