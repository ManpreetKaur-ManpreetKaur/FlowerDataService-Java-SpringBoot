package com.example.flowerdataservice.data.jpa;

import net.minidev.json.annotate.JsonIgnore;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Entity
@Table(name = "flower")
public class Flower {

    @Id
    private String id = "";

    private String label = "";
    private String price = "";
    private String text = "";

    @RestResource(exported = false)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "picture_id", referencedColumnName = "id")
    private Picture pictures = null;

    private String wiki = "";

    public Flower() {
    }

    public Flower(
            String id,
            String label,
            String price,
            String text,
            Picture pictures,
            String wiki
    ) {
        this.id = id;
        this.label = label;
        this.price = price;
        this.text = text;
        this.pictures = pictures;
        this.wiki = wiki;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Picture getPictures() {
        return pictures;
    }

    public void setPictures(Picture pictures) {
        this.pictures = pictures;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }
}
