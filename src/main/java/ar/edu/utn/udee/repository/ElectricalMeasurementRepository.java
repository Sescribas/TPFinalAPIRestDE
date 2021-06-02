package ar.edu.utn.udee.repository;

import ar.edu.utn.udee.models.ElectricalMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectricalMeasurementRepository extends JpaRepository<ElectricalMeasurement, Integer> {

}