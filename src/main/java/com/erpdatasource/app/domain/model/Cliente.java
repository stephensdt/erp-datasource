package com.erpdatasource.app.domain.model;

/**
 * @author Vagner Fellipe
 */
public class Cliente {
    private Integer cgc_9;
    private Integer cgc_4;
    private Integer cgc_2;
    private String nome_cliente;
    private String fantasia_cliente;
    private Integer situacao_cliente;
    private Integer telefone_cliente;
    private Integer telex_cliente;
    private Integer fax_cliente;
    private String endereco_cliente;

    public Cliente() {}

    public Cliente(Integer cgc_9, Integer cgc_4, Integer cgc_2, String nome_cliente, String fantasia_cliente,
                   Integer situacao_cliente, Integer telefone_cliente, Integer telex_cliente, Integer fax_cliente,
                   String endereco_cliente) {
        this.cgc_9 = cgc_9;
        this.cgc_4 = cgc_4;
        this.cgc_2 = cgc_2;
        this.nome_cliente = nome_cliente;
        this.fantasia_cliente = fantasia_cliente;
        this.situacao_cliente = situacao_cliente;
        this.telefone_cliente = telefone_cliente;
        this.telex_cliente = telex_cliente;
        this.fax_cliente = fax_cliente;
        this.endereco_cliente = endereco_cliente;
    }

    public Integer getCgc_9() {
        return cgc_9;
    }

    public void setCgc_9(Integer cgc_9) {
        this.cgc_9 = cgc_9;
    }

    public Integer getCgc_4() {
        return cgc_4;
    }

    public void setCgc_4(Integer cgc_4) {
        this.cgc_4 = cgc_4;
    }

    public Integer getCgc_2() {
        return cgc_2;
    }

    public void setCgc_2(Integer cgc_2) {
        this.cgc_2 = cgc_2;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getFantasia_cliente() {
        return fantasia_cliente;
    }

    public void setFantasia_cliente(String fantasia_cliente) {
        this.fantasia_cliente = fantasia_cliente;
    }

    public Integer getSituacao_cliente() {
        return situacao_cliente;
    }

    public void setSituacao_cliente(Integer situacao_cliente) {
        this.situacao_cliente = situacao_cliente;
    }

    public Integer getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(Integer telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }

    public Integer getTelex_cliente() {
        return telex_cliente;
    }

    public void setTelex_cliente(Integer telex_cliente) {
        this.telex_cliente = telex_cliente;
    }

    public Integer getFax_cliente() {
        return fax_cliente;
    }

    public void setFax_cliente(Integer fax_cliente) {
        this.fax_cliente = fax_cliente;
    }

    public String getEndereco_cliente() {
        return endereco_cliente;
    }

    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }
}
