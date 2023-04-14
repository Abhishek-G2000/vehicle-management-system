package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle_details")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vId;

    private String vName;

    private int vPrice;

    private String vModel;

    private String vColor;

    public long getvId() {
        return vId;
    }

    public void setvId(long vId) {
        this.vId = vId;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public int getvPrice() {
        return vPrice;
    }

    public void setvPrice(int vPrice) {
        this.vPrice = vPrice;
    }

    public String getvModel() {
        return vModel;
    }

    public void setvModel(String vModel) {
        this.vModel = vModel;
    }

    public String getvColor() {
        return vColor;
    }

    public void setvColor(String vColor) {
        this.vColor = vColor;
    }

    public Vehicle(long vId, String vName, int vPrice, String vModel, String vColor) {
        this.vId = vId;
        this.vName = vName;
        this.vPrice = vPrice;
        this.vModel = vModel;
        this.vColor = vColor;
    }

    public Vehicle() {
    }

    @Override
    public String toString() {
        return "Vehicle [vId=" + vId + ", vName=" + vName + ", vPrice=" + vPrice + ", vModel=" + vModel + ", vColor="
                + vColor + "]";
    }

}
