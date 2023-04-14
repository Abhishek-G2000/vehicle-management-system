package com.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Vehicle;
import com.app.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        super();
        this.vehicleService = vehicleService;
    }

    // REST API for Adding Vehicle.
    // http://localhost:8585/vehicle/add.
    @PostMapping("/add")
    public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle) {
        return new ResponseEntity<Vehicle>(vehicleService.addVehicle(vehicle), HttpStatus.CREATED);
    }

    // REST API to Delete Vehicle By Id.
    // http://localhost:8585/vehicle/delete/?.
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteVehicleById(@PathVariable("id") long id) {
        vehicleService.deleteVehicleById(id);
        return new ResponseEntity<String>("Vehicle Deleted Successfully", HttpStatus.OK);
    }

    // REST API to Get All Vehicle.
    // http://localhost:8585/vehicle/getallvehicle.
    @GetMapping("/getallvehicle")
    public List<Vehicle> getAllVehicle() {
        return vehicleService.getAllVehicle();
    }

    // REST API to Get Vehicle By Id.
    // http://localhost:8585/vehicle/getvehicle/?.
    @GetMapping("/getvehicle/{id}")
    public Vehicle getVehicleById(@PathVariable("id") long id) {
        return vehicleService.getVehicleById(id);
    }

    // REST API to Get Vehicle By Color.
    // http://localhost:8585/vehicle/getvehiclecolor?color=?.
    @GetMapping("/getvehicle")
    public ResponseEntity<List<Vehicle>> getVehicleByColor(@RequestParam String color) {
        return new ResponseEntity<List<Vehicle>>(vehicleService.getVehicleByColor(color),
                HttpStatus.OK);
    }

    // REST API to Get All Vehicle Sorted By Price.
    // http://localhost:8585/vehicle/getvehiclecsort.
    @GetMapping("/getvehiclesort")
    public ResponseEntity<List<Vehicle>> getAllVehicleSortedPrice() {
        return new ResponseEntity<List<Vehicle>>(vehicleService.getAllVehicleSort(), HttpStatus.OK);
    }

    // REST API to Update Vehicle By Id.
    // http://localhost:8585/vehicle/update/{id}.
    @PutMapping("/update/{id}")
    public ResponseEntity<Vehicle> updateVehicleById(@PathVariable("id") long id, @RequestBody Vehicle vehicle) {
        vehicle.setvId(id);
        return new ResponseEntity<Vehicle>(vehicleService.updateVehicleById(vehicle), HttpStatus.OK);
    }

}
