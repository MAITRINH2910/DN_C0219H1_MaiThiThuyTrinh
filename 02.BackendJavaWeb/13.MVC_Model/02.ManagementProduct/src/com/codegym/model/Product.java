package com.codegym.model;

public class Product {

    public int id;
    public String nameProduct;
    public double priceProduct;
    public String note;
    public String producer;

    public Product() {
    }

    public Product(int id, String nameProduct, double priceProduct, String note, String producer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.note = note;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
