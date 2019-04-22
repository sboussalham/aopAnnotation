package com.soufiane.json_to_objetct.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Arrays;
import java.util.List;

public class MediaBasic implements IMedia {
    private String CVO = "";
    private String LINE_TYPE = "MEDIA";
    private String MEDIA_TYPE = "";
    private String SUBSCRIPTION_PRICE = "";
    private String COMMISSIONING_PRICE = "";
    private String USAGE_PRICE = "";
    private String FIRST_DEGRESSION_LEVEL = "";
    private String FIRST_DEGRESSION_LEVEL_VALUE = "";
    private String SECOND_DEGRESSION_LEVEL = "";
    private String SECOND_DEGRESSION_LEVEL_VALUE = "";
    private String THIRD_DEGRESSION_LEVEL = "";
    private String THIRD_DEGRESSION_LEVEL_VALUE = "";

    public String getCVO() {
        return CVO;
    }

    public MediaBasic() {
    }

    public MediaBasic(String MEDIA_TYPE, String SUBSCRIPTION_PRICE, String COMMISSIONING_PRICE, String USAGE_PRICE,
                      String FIRST_DEGRESSION_LEVEL, String FIRST_DEGRESSION_LEVEL_VALUE, String SECOND_DEGRESSION_LEVEL,
                      String SECOND_DEGRESSION_LEVEL_VALUE, String THIRD_DEGRESSION_LEVEL, String THIRD_DEGRESSION_LEVEL_VALUE) {
        this.MEDIA_TYPE = MEDIA_TYPE;
        this.SUBSCRIPTION_PRICE = SUBSCRIPTION_PRICE;
        this.COMMISSIONING_PRICE = COMMISSIONING_PRICE;
        this.USAGE_PRICE = USAGE_PRICE;
        this.FIRST_DEGRESSION_LEVEL = FIRST_DEGRESSION_LEVEL;
        this.FIRST_DEGRESSION_LEVEL_VALUE = FIRST_DEGRESSION_LEVEL_VALUE;
        this.SECOND_DEGRESSION_LEVEL = SECOND_DEGRESSION_LEVEL;
        this.SECOND_DEGRESSION_LEVEL_VALUE = SECOND_DEGRESSION_LEVEL_VALUE;
        this.THIRD_DEGRESSION_LEVEL = THIRD_DEGRESSION_LEVEL;
        this.THIRD_DEGRESSION_LEVEL_VALUE = THIRD_DEGRESSION_LEVEL_VALUE;
    }

    public void setCVO(String CVO) {
        this.CVO = CVO;
    }

    public String getLINE_TYPE() {
        return LINE_TYPE;
    }

    public String getMEDIA_TYPE() {
        return MEDIA_TYPE;
    }

    public void setMEDIA_TYPE(String MEDIA_TYPE) {
        this.MEDIA_TYPE = MEDIA_TYPE;
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

    public String getFIRST_DEGRESSION_LEVEL() {
        return FIRST_DEGRESSION_LEVEL;
    }

    public void setFIRST_DEGRESSION_LEVEL(String FIRST_DEGRESSION_LEVEL) {
        this.FIRST_DEGRESSION_LEVEL = FIRST_DEGRESSION_LEVEL;
    }

    public String getFIRST_DEGRESSION_LEVEL_VALUE() {
        return FIRST_DEGRESSION_LEVEL_VALUE;
    }

    public void setFIRST_DEGRESSION_LEVEL_VALUE(String FIRST_DEGRESSION_LEVEL_VALUE) {
        this.FIRST_DEGRESSION_LEVEL_VALUE = FIRST_DEGRESSION_LEVEL_VALUE;
    }

    public String getSECOND_DEGRESSION_LEVEL() {
        return SECOND_DEGRESSION_LEVEL;
    }

    public void setSECOND_DEGRESSION_LEVEL(String SECOND_DEGRESSION_LEVEL) {
        this.SECOND_DEGRESSION_LEVEL = SECOND_DEGRESSION_LEVEL;
    }

    public String getSECOND_DEGRESSION_LEVEL_VALUE() {
        return SECOND_DEGRESSION_LEVEL_VALUE;
    }

    public void setSECOND_DEGRESSION_LEVEL_VALUE(String SECOND_DEGRESSION_LEVEL_VALUE) {
        this.SECOND_DEGRESSION_LEVEL_VALUE = SECOND_DEGRESSION_LEVEL_VALUE;
    }

    public String getTHIRD_DEGRESSION_LEVEL() {
        return THIRD_DEGRESSION_LEVEL;
    }

    public void setTHIRD_DEGRESSION_LEVEL(String THIRD_DEGRESSION_LEVEL) {
        this.THIRD_DEGRESSION_LEVEL = THIRD_DEGRESSION_LEVEL;
    }

    public String getTHIRD_DEGRESSION_LEVEL_VALUE() {
        return THIRD_DEGRESSION_LEVEL_VALUE;
    }

    public void setTHIRD_DEGRESSION_LEVEL_VALUE(String THIRD_DEGRESSION_LEVEL_VALUE) {
        this.THIRD_DEGRESSION_LEVEL_VALUE = THIRD_DEGRESSION_LEVEL_VALUE;
    }

    public List<String> toStringValues() {
        return Arrays.asList(CVO,LINE_TYPE,MEDIA_TYPE,SUBSCRIPTION_PRICE,COMMISSIONING_PRICE,USAGE_PRICE,
                FIRST_DEGRESSION_LEVEL,FIRST_DEGRESSION_LEVEL_VALUE,SECOND_DEGRESSION_LEVEL,SECOND_DEGRESSION_LEVEL_VALUE,
                THIRD_DEGRESSION_LEVEL,THIRD_DEGRESSION_LEVEL_VALUE);
    }
}