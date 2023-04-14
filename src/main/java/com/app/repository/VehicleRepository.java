package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findByvColor(String vColor);

    @Query("SELECT * FROM vms.vehicle_details where v_price>10000")
    List<Vehicle> findallByPrice();

}
