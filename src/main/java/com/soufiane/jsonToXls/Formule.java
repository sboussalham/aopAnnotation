package com.soufiane.jsonToXls;

public class Formule {
    private String id = "";
    private String formulaType = "";

    public Formule() {
    }

    public Formule(String id, String formulaType) {
        this.id = id;
        this.formulaType = formulaType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormulaType() {
        return formulaType;
    }

    public void setFormulaType(String formulaType) {
        this.formulaType = formulaType;
    }
}
