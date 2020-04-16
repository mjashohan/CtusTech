package com.ctustech.api.search;

public class HashProduct extends Product {

    private String hashValue;

    public HashProduct(Product prod, String hashValue) {
        super(prod);
        this.hashValue = hashValue;
    }

    public String getHashValue() {
        return hashValue;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }
}
