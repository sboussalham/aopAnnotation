package com.soufiane.jsonToXls;

import java.util.Arrays;
import java.util.List;

public class Contrat {
    private String CVO = "";
    private String LINE_TYPE = "CONTRAT";
    private String IDETA = "";
    private String IDENT = "";
    private String CREATION_DATE = "";
    private String COMMISSIONING_DATE = "";
    private String ACCOUNT_FE = "";
    private String EMAIL = "";
    private String AGENCY = "";
    private String USAGE_TYPE = "";
    private String TAG = "";
    private String CONTRACT_TYPE = "";
    private String IS_PAYER = "";
    private String MAIN_CVO = "";
    private String GROUP = "";
    private String BILLING_TYPE = "";

    public Contrat() {
    }

    public Contrat(String IDETA, String IDENT, String CREATION_DATE, String COMMISSIONING_DATE, String ACCOUNT_FE,
                   String EMAIL, String AGENCY, String USAGE_TYPE, String TAG, String CONTRACT_TYPE, String IS_PAYER,
                   String MAIN_CVO, String GROUP, String BILLING_TYPE) {
        this.IDETA = IDETA;
        this.IDENT = IDENT;
        this.CREATION_DATE = CREATION_DATE;
        this.COMMISSIONING_DATE = COMMISSIONING_DATE;
        this.ACCOUNT_FE = ACCOUNT_FE;
        this.EMAIL = EMAIL;
        this.AGENCY = AGENCY;
        this.USAGE_TYPE = USAGE_TYPE;
        this.TAG = TAG;
        this.CONTRACT_TYPE = CONTRACT_TYPE;
        this.IS_PAYER = IS_PAYER;
        this.MAIN_CVO = MAIN_CVO;
        this.GROUP = GROUP;
        this.BILLING_TYPE = BILLING_TYPE;
    }

    public String getCVO() {
        return CVO;
    }

    public void setCVO(String CVO) {
        this.CVO = CVO;
    }

    public String getLINE_TYPE() {
        return LINE_TYPE;
    }

    public String getIDETA() {
        return IDETA;
    }

    public void setIDETA(String IDETA) {
        this.IDETA = IDETA;
    }

    public String getIDENT() {
        return IDENT;
    }

    public void setIDENT(String IDENT) {
        this.IDENT = IDENT;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getCOMMISSIONING_DATE() {
        return COMMISSIONING_DATE;
    }

    public void setCOMMISSIONING_DATE(String COMMISSIONING_DATE) {
        this.COMMISSIONING_DATE = COMMISSIONING_DATE;
    }

    public String getACCOUNT_FE() {
        return ACCOUNT_FE;
    }

    public void setACCOUNT_FE(String ACCOUNT_FE) {
        this.ACCOUNT_FE = ACCOUNT_FE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getAGENCY() {
        return AGENCY;
    }

    public void setAGENCY(String AGENCY) {
        this.AGENCY = AGENCY;
    }

    public String getUSAGE_TYPE() {
        return USAGE_TYPE;
    }

    public void setUSAGE_TYPE(String USAGE_TYPE) {
        this.USAGE_TYPE = USAGE_TYPE;
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    public String getCONTRACT_TYPE() {
        return CONTRACT_TYPE;
    }

    public void setCONTRACT_TYPE(String CONTRACT_TYPE) {
        this.CONTRACT_TYPE = CONTRACT_TYPE;
    }

    public String getIS_PAYER() {
        return IS_PAYER;
    }

    public void setIS_PAYER(String IS_PAYER) {
        this.IS_PAYER = IS_PAYER;
    }

    public String getMAIN_CVO() {
        return MAIN_CVO;
    }

    public void setMAIN_CVO(String MAIN_CVO) {
        this.MAIN_CVO = MAIN_CVO;
    }

    public String getGROUP() {
        return GROUP;
    }

    public void setGROUP(String GROUP) {
        this.GROUP = GROUP;
    }

    public String getBILLING_TYPE() {
        return BILLING_TYPE;
    }

    public void setBILLING_TYPE(String BILLING_TYPE) {
        this.BILLING_TYPE = BILLING_TYPE;
    }

    public List<String> toStringValues() {
        return Arrays.asList(CVO,LINE_TYPE,IDETA,IDENT,CREATION_DATE,COMMISSIONING_DATE,ACCOUNT_FE,EMAIL,AGENCY,
                USAGE_TYPE,TAG,CONTRACT_TYPE,IS_PAYER,MAIN_CVO,GROUP,BILLING_TYPE);
    }
}
