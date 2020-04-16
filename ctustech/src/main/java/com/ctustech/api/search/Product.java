package com.ctustech.api.search;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Data
@Document(indexName = "counterfiet", type = "product")
public class Product {

    @Id
    private String id;
    private String year;
    private String week;
    private String alertType;
    private String productUser;
    private String alertNumber;
    private String submittedBy;
    private String category;
    private String product;
    private String brand;
    private String name;
    private String numberOfModel;
    private String batchNumberOrBarcode;
    private String portalCategory;
    private String description;
    private String countryOfOrigin;
    private String counterfeit;
    private String riskType;
    private String technicalDefect;
    private String risk;
    private String adoptedMeassure;
    private String foundAndTakenMeassure;
    private String companyRecallPage;
    private String urlOfCase;
    private String barCode;
    private String batchNumber;
    private String companyRecallCode;
    private String productionDates;
    private String packagingDescription;

    public Product() {
    }

    public Product(Product prod) {
        this.id = prod.getId();
        this.year = prod.getYear();
        this.week = prod.getWeek();
        this.alertType = prod.getAlertType();
        this.productUser = prod.getProductUser();
        this.alertNumber = prod.getAlertNumber();
        this.submittedBy = prod.getSubmittedBy();
        this.category = prod.getCategory();
        this.product = prod.getProduct();
        this.brand = prod.getBrand();
        this.name = prod.getName();
        this.numberOfModel = prod.getNumberOfModel();
        this.batchNumberOrBarcode = prod.getBatchNumberOrBarcode();
        this.portalCategory = prod.portalCategory;
        this.description = prod.getDescription();
        this.countryOfOrigin = prod.getCountryOfOrigin();
        this.counterfeit = prod.getCounterfeit();
        this.riskType = prod.getRiskType();
        this.technicalDefect = prod.getTechnicalDefect();
        this.risk = prod.getRisk();
        this.adoptedMeassure = prod.getAdoptedMeassure();
        this.foundAndTakenMeassure = prod.getFoundAndTakenMeassure();
        this.companyRecallPage = prod.getCompanyRecallPage();
        this.urlOfCase = prod.getUrlOfCase();
        this.barCode = prod.getBarCode();
        this.batchNumber = prod.getBatchNumber();
        this.companyRecallCode = prod.getCompanyRecallCode();
        this.productionDates = prod.getProductionDates();
        this.packagingDescription = prod.getPackagingDescription();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getProductUser() {
        return productUser;
    }

    public void setProductUser(String productUser) {
        this.productUser = productUser;
    }

    public String getAlertNumber() {
        return alertNumber;
    }

    public void setAlertNumber(String alertNumber) {
        this.alertNumber = alertNumber;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfModel() {
        return numberOfModel;
    }

    public void setNumberOfModel(String numberOfModel) {
        this.numberOfModel = numberOfModel;
    }

    public String getBatchNumberOrBarcode() {
        return batchNumberOrBarcode;
    }

    public void setBatchNumberOrBarcode(String batchNumberOrBarcode) {
        this.batchNumberOrBarcode = batchNumberOrBarcode;
    }

    public String getPortalCategory() {
        return portalCategory;
    }

    public void setPortalCategory(String portalCategory) {
        this.portalCategory = portalCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCounterfeit() {
        return counterfeit;
    }

    public void setCounterfeit(String counterfeit) {
        this.counterfeit = counterfeit;
    }

    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public String getTechnicalDefect() {
        return technicalDefect;
    }

    public void setTechnicalDefect(String technicalDefect) {
        this.technicalDefect = technicalDefect;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public String getAdoptedMeassure() {
        return adoptedMeassure;
    }

    public void setAdoptedMeassure(String adoptedMeassure) {
        this.adoptedMeassure = adoptedMeassure;
    }

    public String getFoundAndTakenMeassure() {
        return foundAndTakenMeassure;
    }

    public void setFoundAndTakenMeassure(String foundAndTakenMeassure) {
        this.foundAndTakenMeassure = foundAndTakenMeassure;
    }

    public String getCompanyRecallPage() {
        return companyRecallPage;
    }

    public void setCompanyRecallPage(String companyRecallPage) {
        this.companyRecallPage = companyRecallPage;
    }

    public String getUrlOfCase() {
        return urlOfCase;
    }

    public void setUrlOfCase(String urlOfCase) {
        this.urlOfCase = urlOfCase;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getCompanyRecallCode() {
        return companyRecallCode;
    }

    public void setCompanyRecallCode(String companyRecallCode) {
        this.companyRecallCode = companyRecallCode;
    }

    public String getProductionDates() {
        return productionDates;
    }

    public void setProductionDates(String productionDates) {
        this.productionDates = productionDates;
    }

    public String getPackagingDescription() {
        return packagingDescription;
    }

    public void setPackagingDescription(String packagingDescription) {
        this.packagingDescription = packagingDescription;
    }


}
