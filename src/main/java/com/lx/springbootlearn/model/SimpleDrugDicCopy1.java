package com.lx.springbootlearn.model;

public class SimpleDrugDicCopy1 {
    private Integer id;

    private String diseaseName;

    private String t1;

    private String t2;

    private String t3;

    private String t4;

    private String t5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1 == null ? null : t1.trim();
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2 == null ? null : t2.trim();
    }

    public String getT3() {
        return t3;
    }

    public void setT3(String t3) {
        this.t3 = t3 == null ? null : t3.trim();
    }

    public String getT4() {
        return t4;
    }

    public void setT4(String t4) {
        this.t4 = t4 == null ? null : t4.trim();
    }

    public String getT5() {
        return t5;
    }

    public void setT5(String t5) {
        this.t5 = t5 == null ? null : t5.trim();
    }
}