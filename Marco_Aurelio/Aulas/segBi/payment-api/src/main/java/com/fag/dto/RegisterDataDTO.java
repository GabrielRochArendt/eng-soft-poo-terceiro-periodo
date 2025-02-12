package com.fag.dto;

import java.math.BigDecimal;

public class RegisterDataDTO {
    
    private String documentRecipient;

    private String documentPayer;

    private String payDueDate;

    private String dueDateRegister;

    private boolean allowChangeValue;

    private String recipient;

    private String payer;

    private BigDecimal discountValue;

    private BigDecimal interestValueCalculated;

    private BigDecimal maxValue;

    private BigDecimal fineValueCalculated;

    private BigDecimal originalValue;

    private BigDecimal totalUpdated;

    private BigDecimal totalWithDiscount;

    private BigDecimal totalWithAdditional;

    public String getDocumentRecipient() {
        return documentRecipient;
    }

    public String getDocumentPayer() {
        return documentPayer;
    }

    public String getPayDueDate() {
        return payDueDate;
    }

    public String getDueDateRegister() {
        return dueDateRegister;
    }

    public boolean isAllowChangeValue() {
        return allowChangeValue;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getPayer() {
        return payer;
    }

    public BigDecimal getDiscountValue() {
        return discountValue;
    }

    public BigDecimal getInterestValueCalculated() {
        return interestValueCalculated;
    }

    public BigDecimal getMaxValue() {
        return maxValue;
    }

    public BigDecimal getFineValueCalculated() {
        return fineValueCalculated;
    }

    public BigDecimal getOriginalValue() {
        return originalValue;
    }

    public BigDecimal getTotalUpdated() {
        return totalUpdated;
    }

    public BigDecimal getTotalWithDiscount() {
        return totalWithDiscount;
    }

    public BigDecimal getTotalWithAdditional() {
        return totalWithAdditional;
    }

    public void setDocumentRecipient(String documentRecipient) {
        this.documentRecipient = documentRecipient;
    }

    public void setDocumentPayer(String documentPayer) {
        this.documentPayer = documentPayer;
    }

    public void setPayDueDate(String payDueDate) {
        this.payDueDate = payDueDate;
    }

    public void setDueDateRegister(String dueDateRegister) {
        this.dueDateRegister = dueDateRegister;
    }

    public void setAllowChangeValue(boolean allowChangeValue) {
        this.allowChangeValue = allowChangeValue;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public void setDiscountValue(BigDecimal discountValue) {
        this.discountValue = discountValue;
    }

    public void setInterestValueCalculated(BigDecimal interestValueCalculated) {
        this.interestValueCalculated = interestValueCalculated;
    }

    public void setMaxValue(BigDecimal maxValue) {
        this.maxValue = maxValue;
    }

    public void setFineValueCalculated(BigDecimal fineValueCalculated) {
        this.fineValueCalculated = fineValueCalculated;
    }

    public void setOriginalValue(BigDecimal originalValue) {
        this.originalValue = originalValue;
    }

    public void setTotalUpdated(BigDecimal totalUpdated) {
        this.totalUpdated = totalUpdated;
    }

    public void setTotalWithDiscount(BigDecimal totalWithDiscount) {
        this.totalWithDiscount = totalWithDiscount;
    }

    public void setTotalWithAdditional(BigDecimal totalWithAdditional) {
        this.totalWithAdditional = totalWithAdditional;
    }
}
