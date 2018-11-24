package com.soufiane.jsonToXls;

public class Contrat {
    private String cvo = "";
    private String contractType = "";

    public Contrat() {
    }

    public Contrat(String cvo, String contractType) {
        this.cvo = cvo;
        this.contractType = contractType;
    }

    public String getCvo() {
        return cvo;
    }

    public void setCvo(String cvo) {
        this.cvo = cvo;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }
}
