package com.shop.gestioneOrdine;
import java.util.List;

public class Order {
    private long id;
    private List<Product> listaProdotti;
    private Status status;
    private int quantitaProdotti;

    public Order() {}


    public long getId() {
        return id;
    }


    public List<Product> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Product> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantitaProdotti() {
        return quantitaProdotti;
    }

    public void setQuantitaProdotti(int quantitaProdotti) {
        this.quantitaProdotti = quantitaProdotti;
    }
}
