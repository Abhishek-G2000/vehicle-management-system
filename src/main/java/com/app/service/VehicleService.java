package com.app.service;

import java.util.List;
//import java.util.Optional;

import com.app.model.Vehicle;

public interface VehicleService {

    Vehicle addVehicle(Vehicle vehicle);

    void deleteVehicleById(long id);

    List<Vehicle> getAllVehicle();

    Vehicle getVehicleById(long id);

    List<Vehicle> getVehicleByColor(String color);

    List<Vehicle> getAllVehicleSort();

    Vehicle updateVehicleById(Vehicle vehicle);

}
