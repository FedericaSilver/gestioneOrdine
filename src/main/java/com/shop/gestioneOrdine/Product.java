package com.shop.gestioneOrdine;

public class Product {
    private String nome;
    private String marca;
    private double prezzo;

    public Product(String nome, String marca, double prezzo) {
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
