package com.soufiane.jsonToXls;

import java.util.List;

public class Contrats {
    private Contrat contrat;
    private Formule formule;
    private List<Media> mediaList;
    private List<Option> optionList;

    public Contrats() {
    }

    public Contrats(Contrat contrat, Formule formule, List<Media> mediaList, List<Option> optionList) {
        this.contrat = contrat;
        this.formule = formule;
        this.mediaList = mediaList;
        this.optionList = optionList;
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

    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }
}
