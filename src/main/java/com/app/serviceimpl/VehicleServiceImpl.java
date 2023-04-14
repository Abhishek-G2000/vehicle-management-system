package com.app.serviceimpl;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.app.model.Vehicle;
import com.app.repository.VehicleRepository;
import com.app.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

    private VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicleById(long id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(long id) {
        // Optional<Vehicle> vehicle = vehicleRepository.findById(id);
        return vehicleRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Vehicle> getVehicleByColor(String color) {
        return vehicleRepository.findByvColor(color);
    }

    @Override
    public List<Vehicle> getAllVehicleSort() {
        Sort sort = Sort.by(Direction.ASC, "vPrice");
        return vehicleRepository.findAll(sort);
    }

    @Override
    public Vehicle updateVehicleById(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

}
