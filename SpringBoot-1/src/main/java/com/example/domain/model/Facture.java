package com.example.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String clientName;

    private Double priceWithoutVat;

    private Double priceWithVat;

    private Long clientNIP;

    @JsonIgnore
    @ManyToMany(mappedBy="factures", fetch = FetchType.LAZY)
    private List<Item> items;

    //---- Getters and setters----

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getPriceWithoutVat() {
        return priceWithoutVat;
    }

    public void setPriceWithoutVat(Double priceWithoutVat) {
        this.priceWithoutVat = priceWithoutVat;
    }

    public Double getPriceWithVat() {
        return priceWithVat;
    }

    public void setPriceWithVat(Double priceWithVat) {
        this.priceWithVat = priceWithVat;
    }

    public Long getClientNIP() {
        return clientNIP;
    }

    public void setClientNIP(Long clientNIP) {
        this.clientNIP = clientNIP;
    }

    public Collection<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
