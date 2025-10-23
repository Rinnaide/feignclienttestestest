package com.senac.feignclienttestestest_main;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CepResponse {
    private String logradouro;
    private String bairro;
    private String localidade;
    private String estado;

    // Default constructor
    public CepResponse() {}

    // Constructor with parameters
    public CepResponse(String logradouro, String bairro, String localidade, String estado) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.estado = estado;
    }

    // Getters and Setters
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CepResponse{" +
                "logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
