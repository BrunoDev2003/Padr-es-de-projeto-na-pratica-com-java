package model;

import javax.persistence.Id;

public class endereco {
    @Id
    private String cep;
    private String lougradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLougradouro() {
        return lougradouro;
    }
    public void setLougradouro(String lougradouro) {
        this.lougradouro = lougradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    
    
}
