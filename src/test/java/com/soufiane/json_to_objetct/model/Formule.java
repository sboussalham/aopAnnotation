package com.soufiane.json_to_objetct.model;

import java.util.Arrays;
import java.util.List;

public class Formule {
    private String CVO = "";
    private String LINE_TYPE = "FORMULE";
    private String FORMULA = "";
    private String COMMITMENT_PERIOD = "";
    private String DISCOUNT_ON_COMMITMENT = "";
    private String ANNUAL_ADVANCE_PRICE = "";
    private String ENTITIES_INVOICING_SUBSCRIPTION_PRICE = "";
    private String COMMITMENT_PRICE = "";
    private String SMS_OUT_OF_BOUND_PRICE = "";
    private String HAS_REPORT_OPTION = "";
    private String REPORT_PRICE = "";
    private String ENTITIES_INVOICING_COMMISSIONING_PRICE = "";
    private String HAS_INTERNATIONAL = "";

    public Formule() {
    }

    public Formule(String FORMULA, String COMMITMENT_PERIOD, String DISCOUNT_ON_COMMITMENT, String ANNUAL_ADVANCE_PRICE,
                   String ENTITIES_INVOICING_SUBSCRIPTION_PRICE, String COMMITMENT_PRICE) {
        this.FORMULA = FORMULA;
        this.COMMITMENT_PERIOD = COMMITMENT_PERIOD;
        this.DISCOUNT_ON_COMMITMENT = DISCOUNT_ON_COMMITMENT;
        this.ANNUAL_ADVANCE_PRICE = ANNUAL_ADVANCE_PRICE;
        this.ENTITIES_INVOICING_SUBSCRIPTION_PRICE = ENTITIES_INVOICING_SUBSCRIPTION_PRICE;
        this.COMMITMENT_PRICE = COMMITMENT_PRICE;
    }

    public String getFORMULA() {
        return FORMULA;
    }

    public String getCVO() {
        return CVO;
    }

    public void setCVO(String CVO) {
        this.CVO = CVO;
    }

    public String getCOMMITMENT_PRICE() {
        return COMMITMENT_PRICE;
    }

    public void setCOMMITMENT_PRICE(String COMMITMENT_PRICE) {
        this.COMMITMENT_PRICE = COMMITMENT_PRICE;
    }

    public String getSMS_OUT_OF_BOUND_PRICE() {
        return SMS_OUT_OF_BOUND_PRICE;
    }

    public void setSMS_OUT_OF_BOUND_PRICE(String SMS_OUT_OF_BOUND_PRICE) {
        this.SMS_OUT_OF_BOUND_PRICE = SMS_OUT_OF_BOUND_PRICE;
    }

    public String getHAS_REPORT_OPTION() {
        return HAS_REPORT_OPTION;
    }

    public void setHAS_REPORT_OPTION(String HAS_REPORT_OPTION) {
        this.HAS_REPORT_OPTION = HAS_REPORT_OPTION;
    }

    public String getREPORT_PRICE() {
        return REPORT_PRICE;
    }

    public void setREPORT_PRICE(String REPORT_PRICE) {
        this.REPORT_PRICE = REPORT_PRICE;
    }

    public String getENTITIES_INVOICING_COMMISSIONING_PRICE() {
        return ENTITIES_INVOICING_COMMISSIONING_PRICE;
    }

    public void setENTITIES_INVOICING_COMMISSIONING_PRICE(String ENTITIES_INVOICING_COMMISSIONING_PRICE) {
        this.ENTITIES_INVOICING_COMMISSIONING_PRICE = ENTITIES_INVOICING_COMMISSIONING_PRICE;
    }

    public String getHAS_INTERNATIONAL() {
        return HAS_INTERNATIONAL;
    }

    public void setHAS_INTERNATIONAL(String HAS_INTERNATIONAL) {
        this.HAS_INTERNATIONAL = HAS_INTERNATIONAL;
    }

    public void setFORMULA(String FORMULA) {
        this.FORMULA = FORMULA;
    }

    public String getLINE_TYPE() {
        return LINE_TYPE;
    }

    public String getCOMMITMENT_PERIOD() {
        return COMMITMENT_PERIOD;
    }

    public void setCOMMITMENT_PERIOD(String COMMITMENT_PERIOD) {
        this.COMMITMENT_PERIOD = COMMITMENT_PERIOD;
    }

    public String getDISCOUNT_ON_COMMITMENT() {
        return DISCOUNT_ON_COMMITMENT;
    }

    public void setDISCOUNT_ON_COMMITMENT(String DISCOUNT_ON_COMMITMENT) {
        this.DISCOUNT_ON_COMMITMENT = DISCOUNT_ON_COMMITMENT;
    }

    public String getANNUAL_ADVANCE_PRICE() {
        return ANNUAL_ADVANCE_PRICE;
    }

    public void setANNUAL_ADVANCE_PRICE(String ANNUAL_ADVANCE_PRICE) {
        this.ANNUAL_ADVANCE_PRICE = ANNUAL_ADVANCE_PRICE;
    }

    public String getENTITIES_INVOICING_SUBSCRIPTION_PRICE() {
        return ENTITIES_INVOICING_SUBSCRIPTION_PRICE;
    }

    public void setENTITIES_INVOICING_SUBSCRIPTION_PRICE(String ENTITIES_INVOICING_SUBSCRIPTION_PRICE) {
        this.ENTITIES_INVOICING_SUBSCRIPTION_PRICE = ENTITIES_INVOICING_SUBSCRIPTION_PRICE;
    }

    public List<String> toStringValues() {
        return Arrays.asList(CVO,LINE_TYPE,FORMULA,COMMITMENT_PERIOD,DISCOUNT_ON_COMMITMENT,ANNUAL_ADVANCE_PRICE,
                ENTITIES_INVOICING_SUBSCRIPTION_PRICE,COMMITMENT_PRICE,SMS_OUT_OF_BOUND_PRICE,HAS_REPORT_OPTION,
                REPORT_PRICE,ENTITIES_INVOICING_COMMISSIONING_PRICE,HAS_INTERNATIONAL);
    }
}