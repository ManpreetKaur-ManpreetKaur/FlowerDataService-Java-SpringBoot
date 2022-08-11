package ca.tetervak.flowerdataservice.data.jpa;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "flower")
public class Flower {

    @Id
    private String id = "";

    private String label = "";
    private BigDecimal price = BigDecimal.valueOf(0.0);
    private String description = "";

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
            double price,
            String description,
            Picture pictures,
            String wiki
    ) {
        this.id = id;
        this.label = label;
        this.price = BigDecimal.valueOf(price);
        this.description = description;
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

    public double getPrice() {
        return price.doubleValue();
    }

    public void setPrice(Double price) {
        this.price = BigDecimal.valueOf(price);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String text) {
        this.description = text;
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
