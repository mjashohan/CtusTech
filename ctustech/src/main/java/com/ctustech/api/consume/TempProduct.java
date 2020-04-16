package com.ctustech.api.consume;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Entity
@Table(name="products")
@Data
public class TempProduct {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@JsonProperty("Year")
	private String year;
	@JsonProperty("Week")
    private String week;
    @JsonProperty("Type of alert")
    private String alertType;
    @JsonProperty("Product user")
    private String productUser;
    @JsonProperty("Alert number")
    private String alertNumber;
    @JsonProperty("Alert submitted by")
    private String submittedBy;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("Product")
    private String product;
    @JsonProperty("Brand")
    private String brand;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Type or number of model")
    @Column(columnDefinition="TEXT")
    private String numberOfModel;
    @JsonProperty("Batch number / Barcode")
    private String batchNumberOrBarcode;
    @JsonProperty("OECD Portal Category")
    private String portalCategory;
    @JsonProperty("Description")
    @Column(columnDefinition="TEXT")
    private String description;
    @JsonProperty("Country of origin")
    private String countryOfOrigin;
    @JsonProperty("Counterfeit")
    private String counterfeit;
    @JsonProperty("Risk type")
    private String riskType;
    @JsonProperty("Technical defect")
    @Column(columnDefinition="TEXT")
    private String technicalDefect;
    @JsonProperty("Risk")
    private String risk;
    @JsonProperty("Measures adopted by notifying country")
    private String adoptedMeassure;
    @JsonProperty("Products were found and measures were taken also in")
    private String foundAndTakenMeassure;
    @JsonProperty("Company recall page")
    private String companyRecallPage;
    @JsonProperty("URL of Case")
    @Column(columnDefinition="TEXT")
    private String urlOfCase;
    @JsonProperty("Barcode")
    private String barCode;
    @JsonProperty("Batch number")
    private String batchNumber;
    @JsonAlias({"Company recall code (**)","Company recall code"})
    @JsonProperty("Company recall code (**)")
    private String companyRecallCode;
    @JsonAlias({"Production dates (**)","Production dates"})
    @JsonProperty("Production dates (**)")
    private String productionDates;
    @JsonProperty("Packaging description")
    @Column(columnDefinition="TEXT")
    private String packagingDescription;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
