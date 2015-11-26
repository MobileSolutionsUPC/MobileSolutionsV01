package com.mobilesolutions.model;

/**
 * Created by jhonathan on 26/11/15.
 */

import java.util.Date;

public class Subasta {

    private Integer auctionId;
    private Date startDate;
    private Date endDate;
    private String status;
    private String basePrice;
    private Vehiculo vehiculo;

    //Getters y Setters

    public Integer getAuctionId() {
        return auctionId;
    }
    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
