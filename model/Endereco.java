package model;

import enums.TipoEndereco;

import java.io.Serializable;
import java.util.Objects;

public class Endereco implements Serializable {
    private String cep;
    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;
    private TipoEndereco tipoEndereco;

    public Endereco() {
    }

    public Endereco(String cep, String logradouro, String numero, String cidade, String estado, TipoEndereco tipoEndereco) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.tipoEndereco = tipoEndereco;
    }
    

    public Endereco(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getEnderecosDetalhado() {
        return "Tipo de Endereco | " + tipoEndereco + ": " + logradouro +
                " - " + numero + ", " + cidade + " - " + estado +
                " - CEP:" + cep;
    }
    
    public String getEnderecosSimples() {
        return (estado +" " + cidade +" ");
    }

    @Override
    public String toString() {
//        return "Endereco{" +
//                "cep='" + cep + '\'' +
//                ", logradouro='" + logradouro + '\'' +
//                ", numero='" + numero + '\'' +
//                ", cidade='" + cidade + '\'' +
//                ", estado='" + estado + '\'' +
//                ", tipoEndereco=" + tipoEndereco +
//                '}';
        return logradouro + ":" + numero + ":" + cidade + ":" + estado + ":" + cep + ":" + tipoEndereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(cep, endereco.cep) && Objects.equals(logradouro, endereco.logradouro) && Objects.equals(numero, endereco.numero) && Objects.equals(cidade, endereco.cidade) && Objects.equals(estado, endereco.estado) && tipoEndereco == endereco.tipoEndereco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep, logradouro, numero, cidade, estado, tipoEndereco);
    }
}
