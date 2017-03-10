package com.kcs.auto.adverts.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Askew on 3/9/2017.
 */
public class Advert {
    private int id;
    private BigDecimal price;
    private String description;
    private Date insertTime;
    private String city;
    private Date activeUntil;
    private String email;
    private String phone;
    private String shortDescription;

    public Advert (){}

    public Advert(int id, BigDecimal price, String description, Date insertTime, String city, Date activeUntil, String email, String phone, String shortDescription) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.insertTime = insertTime;
        this.city = city;
        this.activeUntil = activeUntil;
        this.email = email;
        this.phone = phone;
        this.shortDescription = shortDescription;
    }

    public Advert(BigDecimal price, String description, Date insertTime, String city, Date activeUntil, String email, String phone, String shortDescription) {
        this.price = price;
        this.description = description;
        this.insertTime = insertTime;
        this.city = city;
        this.activeUntil = activeUntil;
        this.email = email;
        this.phone = phone;
        this.shortDescription = shortDescription;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public String getCity() {
        return city;
    }

    public Date getActiveUntil() {
        return activeUntil;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setActiveUntil(Date activeUntil) {
        this.activeUntil = activeUntil;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
