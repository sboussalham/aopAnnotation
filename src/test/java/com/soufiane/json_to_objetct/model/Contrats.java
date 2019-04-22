package com.soufiane.json_to_objetct.model;

import java.util.ArrayList;
import java.util.List;

public class Contrats {
    private Contrat contrat = new Contrat();
    private Formule formule = new Formule();
    private List<IMedia> mediaList = new ArrayList<>();
    private List<Option> optionList = new ArrayList<>();

    public Contrats() {
    }

    public Contrats(Contrat contrat, Formule formule, List<IMedia> mediaList, List<Option> optionList) {
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

    public List<IMedia> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<IMedia> mediaList) {
        this.mediaList = mediaList;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }
}
