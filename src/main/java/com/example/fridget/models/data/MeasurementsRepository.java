package com.example.fridget.models.data;

import com.example.fridget.models.Measurements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MeasurementsRepository extends JpaRepository<Measurements, Long> {
}
