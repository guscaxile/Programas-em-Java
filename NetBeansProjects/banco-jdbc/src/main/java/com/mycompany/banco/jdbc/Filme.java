package com.mycompany.banco.jdbc;

/**
 *
 * @author gustavo
 */
public class Filme {
    
    private Integer id;
    private String nome;
    private Integer anoLancamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Filme{id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", anoLancamento=").append(anoLancamento);
        sb.append('}');
        return sb.toString();
    }
}
