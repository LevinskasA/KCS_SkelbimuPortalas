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
    private String short_description;

    public Advert(int id, BigDecimal price, String description, Date insertTime, String city, Date activeUntil, String email, String phone, String short_description) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.insertTime = insertTime;
        this.city = city;
        this.activeUntil = activeUntil;
        this.email = email;
        this.phone = phone;
        this.short_description = short_description;
    }

    public Advert(BigDecimal price, String description, Date insertTime, String city, Date activeUntil, String email, String phone, String short_description) {
        this.price = price;
        this.description = description;
        this.insertTime = insertTime;
        this.city = city;
        this.activeUntil = activeUntil;
        this.email = email;
        this.phone = phone;
        this.short_description = short_description;
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

    public String getShort_description() {
        return short_description;
    }
}
