package com.soufiane.json_to_objetct.model;

import java.util.Arrays;
import java.util.List;

public class Option {
    private String CVO = "";
    private String LINE_TYPE = "OPTION";
    private String OPTION_TYPE = "";
    private String LABEL = "";
    private String COMMITMENT_PERIOD = "";
    private String SUBSCRIPTION_PRICE = "";
    private String COMMISSIONING_PRICE = "";
    private String USAGE_PRICE = "";
    private String QUANTITY = "";
    private String IS_ENTITY_PAYER = "";

    public Option() {
    }

    public Option(String OPTION_TYPE, String LABEL, String COMMITMENT_PERIOD, String SUBSCRIPTION_PRICE, String COMMISSIONING_PRICE) {
        this.OPTION_TYPE = OPTION_TYPE;
        this.LABEL = LABEL;
        this.COMMITMENT_PERIOD = COMMITMENT_PERIOD;
        this.SUBSCRIPTION_PRICE = SUBSCRIPTION_PRICE;
        this.COMMISSIONING_PRICE = COMMISSIONING_PRICE;
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

    public void setLINE_TYPE(String LINE_TYPE) {
        this.LINE_TYPE = LINE_TYPE;
    }

    public String getOPTION_TYPE() {
        return OPTION_TYPE;
    }

    public void setOPTION_TYPE(String OPTION_TYPE) {
        this.OPTION_TYPE = OPTION_TYPE;
    }

    public String getLABEL() {
        return LABEL;
    }

    public void setLABEL(String LABEL) {
        this.LABEL = LABEL;
    }

    public String getCOMMITMENT_PERIOD() {
        return COMMITMENT_PERIOD;
    }

    public void setCOMMITMENT_PERIOD(String COMMITMENT_PERIOD) {
        this.COMMITMENT_PERIOD = COMMITMENT_PERIOD;
    }

    public String getSUBSCRIPTION_PRICE() {
        return SUBSCRIPTION_PRICE;
    }

    public void setSUBSCRIPTION_PRICE(String SUBSCRIPTION_PRICE) {
        this.SUBSCRIPTION_PRICE = SUBSCRIPTION_PRICE;
    }

    public String getCOMMISSIONING_PRICE() {
        return COMMISSIONING_PRICE;
    }

    public void setCOMMISSIONING_PRICE(String COMMISSIONING_PRICE) {
        this.COMMISSIONING_PRICE = COMMISSIONING_PRICE;
    }

    public String getUSAGE_PRICE() {
        return USAGE_PRICE;
    }

    public void setUSAGE_PRICE(String USAGE_PRICE) {
        this.USAGE_PRICE = USAGE_PRICE;
    }

    public String getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(String QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public String getIS_ENTITY_PAYER() {
        return IS_ENTITY_PAYER;
    }

    public void setIS_ENTITY_PAYER(String IS_ENTITY_PAYER) {
        this.IS_ENTITY_PAYER = IS_ENTITY_PAYER;
    }

    public List<String> toStringValues() {
        return Arrays.asList(CVO,LINE_TYPE,OPTION_TYPE,LABEL,COMMITMENT_PERIOD,SUBSCRIPTION_PRICE,COMMISSIONING_PRICE,
                USAGE_PRICE,QUANTITY,IS_ENTITY_PAYER);
    }
}