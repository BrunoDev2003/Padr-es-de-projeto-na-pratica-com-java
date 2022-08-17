package model;

import javax.persistence.ManyToOne;

public class Cliente {
    private Long id;
    private String nome;
    @ManyToOne
    private Endereco endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
