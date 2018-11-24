package com.soufiane.jsonToXls;

public class Contrats {
    private Contrat contrat;
    private Formule formule;

    public Contrats() {
    }

    public Contrats(Contrat contrat, Formule formule) {
        this.contrat = contrat;
        this.formule = formule;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public Formule getFormule() {
        return formule;
    }

    public void setFormule(Formule formule) {
        this.formule = formule;
    }
}
