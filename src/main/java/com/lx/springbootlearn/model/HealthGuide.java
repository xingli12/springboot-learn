package com.lx.springbootlearn.model;

public class HealthGuide {
    private Integer id;

    private String icd10;

    private String diagnosis;

    private String healthGuide;

    private Integer frequency;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIcd10() {
        return icd10;
    }

    public void setIcd10(String icd10) {
        this.icd10 = icd10 == null ? null : icd10.trim();
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis == null ? null : diagnosis.trim();
    }

    public String getHealthGuide() {
        return healthGuide;
    }

    public void setHealthGuide(String healthGuide) {
        this.healthGuide = healthGuide == null ? null : healthGuide.trim();
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }
}